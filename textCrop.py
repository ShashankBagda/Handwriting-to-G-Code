import cv2
import os

def remove_black_borders(image_path, output_path):
    """
    Removes black borders from an image and saves it.

    Parameters:
        image_path (str): Path to the input image file.
        output_path (str): Path to save the output image file.
    """
    # Read image
    image = cv2.imread(image_path)

    # Convert to grayscale
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # Apply edge detection
    edges = cv2.Canny(gray, 50, 150)

    # Find contours
    contours, _ = cv2.findContours(edges, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    # Get bounding box of largest contour
    x, y, w, h = cv2.boundingRect(contours[0]) # type: ignore

    # Crop the image using the bounding box
    cropped_image = image[y:y+h, x:x+w]

    # Save the cropped image
    cv2.imwrite(output_path, cropped_image)

def remove_black_borders_in_folder(input_folder, output_folder):
    """
    Removes black borders from all images in a folder.

    Parameters:
        input_folder (str): Path to the input folder containing images.
        output_folder (str): Path to save the output images.
    """
    # Create the output folder if it doesn't exist
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    # Get a list of all image files in the input folder
    image_files = [f for f in os.listdir(input_folder) if os.path.isfile(os.path.join(input_folder, f))]

    # Process each image file
    for image_file in image_files:
        input_path = os.path.join(input_folder, image_file)
        output_path = os.path.join(output_folder, image_file)
        remove_black_borders(input_path, output_path)

# Input and output folder paths
input_folder = "Output"
output_folder = "Output"

# Remove black borders from images in the input folder and save them to the output folder
remove_black_borders_in_folder(input_folder, output_folder)
