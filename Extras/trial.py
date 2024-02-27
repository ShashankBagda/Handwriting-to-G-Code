import cv2
import os
from PIL import Image
import subprocess
import shutil

def detect_and_crop_boxes(image_path, output_folder, square_size):
    # Load the image
    image = cv2.imread(image_path)
    grayscale = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # Apply edge detection to emphasize boundaries
    edges = cv2.Canny(grayscale, 50, 150)

    # Find contours in the edge image
    contours, _ = cv2.findContours(edges, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    # Create the output folder if it doesn't exist
    os.makedirs(output_folder, exist_ok=True)

    # Crop and save each detected square box
    for i, contour in enumerate(contours):
        # Approximate the contour to a polygon
        epsilon = 0.03 * cv2.arcLength(contour, True)
        approx = cv2.approxPolyDP(contour, epsilon, True)

        # Skip non-quadrilateral contours
        if len(approx) != 4:
            continue

        # Sort the vertices in a clockwise order
        box = cv2.boundingRect(approx.reshape(-1, 2))
        (x, y, w, h) = box
        if w < h:
            (x, y, w, h) = (x, y, h, h)
        else:
            (x, y, w, h) = (x, y, w, w)

        # Skip small or non-square boxes
        aspect_ratio = w / float(h)
        if w < 50 or h < 50 or aspect_ratio < 0.9 or aspect_ratio > 1.1:
            continue

        # Determine the size of the square region to crop
        size = min(w, h)

        # Calculate the cropping region (modified to crop inside the detected contour)
        padding = int(size * 0.1)  # 10% padding inside the square
        x_min = x + padding
        y_min = y + padding
        x_max = x + w - padding
        y_max = y + h - padding

        # Crop the square region from the original image
        cropped_box = image[y_min:y_max, x_min:x_max]

        # Resize the cropped image to the desired square size
        cropped_box = cv2.resize(cropped_box, (square_size, square_size))

        # Save the cropped box as a separate image
        if i < 93:
            output_path = os.path.join(output_folder, f'box_{i}.png')
            cv2.imwrite(output_path, cropped_box)

def remove_white_background(image_path, output_path):
    image = Image.open(image_path)
    image = image.convert("RGBA")  # Convert the image to RGBA mode

    data = image.getdata()  # Get pixel data

    new_data = []
    for item in data:
        # Check if the pixel is mostly white (close to pure white)
        if item[0] > 200 and item[1] > 200 and item[2] > 200:
            new_data.append((255, 255, 255, 0))  # Set the pixel to transparent
        else:
            new_data.append(item)

    # Update the image with the new data
    image.putdata(new_data)

    # Save the image with a transparent background
    image.save(output_path, "PNG")

def process_images(input_folder, output_folder):
    # Process the images in the input folder and save them to the output folder
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    for filename in os.listdir(input_folder):
        if filename.endswith((".png", ".jpg", ".jpeg")):
            input_path = os.path.join(input_folder, filename)
            output_path = os.path.join(output_folder, filename)
            remove_white_background(input_path, output_path)

def rename_files(folder_path):
    default = 'box_'
    prefix = 'image'
    j = 0
    k = 0

    num_arr = ['9', '8', '7', '6', '5', '4', '3', '2', '1', '0']
    alphabet_arr = ['z', 'y', 'x', 'w', 'v', 'Z', 'Y', 'X', 'W', 'V', 'u', 't', 's', 'r', 'q', 'U', 'T', 'S', 'R', 'Q', 'p', 'o', 'n', 'm', 'l', 'P', 'O', 'N', 'M', 'L', 'k', 'j', 'i', 'h', 'g', 'K', 'J', 'I', 'H', 'G', 'f', 'e', 'd', 'c', 'b', 'F', 'E', 'D', 'C', 'B', 'a', 'A']
    special_char = ['_semicolon','_double_InComma_start','_double_InComma_end','_underscore','_equals','_addition','_substraction','_brac_curl_end','_brac_curl_start','_brac_square_end','_brac_square_start','_multiplication','_hashtag','_and','_percentage','_dollar','_tilde','_brac_round_end','_brac_round_start','_greaterthan','_lessthan','_slash','_toPower','_atharet','_question','_exclamation','_colon','_comma','_apostrophe','_backquote','_backSlash']

    file_list = os.listdir(folder_path)
    for i, filename in enumerate(file_list):
        old = os.path.join(folder_path, default + str(i) + '.png')

        if i < len(num_arr):
            new = os.path.join(folder_path, num_arr[i] + '.png')
            os.rename(old, new)
        elif i > 40:
            new_al = os.path.join(folder_path, alphabet_arr[j] + '.png')
            os.rename(old, new_al)
            j += 1
        else:
            new_al = os.path.join(folder_path, special_char[k] + '.png')
            os.rename(old, new_al)
            k += 1

def main():
    image_path = 'Image.png'
    output_folder = 'Images'
    square_size = 50  # Specify the desired square size in pixels

    detect_and_crop_boxes(image_path, output_folder, square_size)

    subprocess.run(['python3', 'removebg.py'])

    input_folder = "Images"
    output_folder = "Withoutbg"
    process_images(input_folder, output_folder)

    shutil.rmtree(input_folder)

    subprocess.run(['python3', 'rename.py'])

if __name__ == "__main__":
    main()
