import cv2
import os
import subprocess

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

# Example usage
image_path = 'image.png'
output_folder = 'Images'
square_size = 50  # Specify the desired square size in pixels

detect_and_crop_boxes(image_path, output_folder, square_size)

subprocess.run(['python3', 'removebg.py'])