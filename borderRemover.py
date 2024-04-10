import os
import cv2

def crop_and_resize(image_path, size):
    # Read the image
    img = cv2.imread(image_path)
    
    # Get dimensions of the image
    h, w = img.shape[:2]

    # Calculate dimensions for cropping
    if h > w:
        start = 0
        end = w
        cropped_img = img[start:end, :]
    else:
        start = (w - h) // 2
        end = start + h
        cropped_img = img[:, start:end]

    # Resize the cropped image to the desired size
    resized_img = cv2.resize(cropped_img, (size, size))

    return resized_img

def process_images(input_folder, output_folder, size):
    # Ensure the output folder exists
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    # Process each image in the input folder
    for filename in os.listdir(input_folder):
        if filename.endswith(('.jpg', '.jpeg', '.png')):  # Process only image files
            input_path = os.path.join(input_folder, filename)
            output_path = os.path.join(output_folder, filename)
            resized_img = crop_and_resize(input_path, size)
            cv2.imwrite(output_path, resized_img)

# Example usage:
input_folder = 'Output'  # Input folder containing images
output_folder = 'Output'  # Output folder for resized images
output_size = 256  # Output size (in pixels) for both width and height
process_images(input_folder, output_folder, output_size)
