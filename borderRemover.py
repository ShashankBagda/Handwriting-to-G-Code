from PIL import Image
import os

def remove_black_border(image_path, output_path):
    """
    Removes black borders from an image and saves it.

    Parameters:
        image_path (str): Path to the input image file.
        output_path (str): Path to save the output image file.
    """
    image = Image.open(image_path)
    image_data = image.getdata()

    # Find non-black pixels
    non_black_pixels = [pixel for pixel in image_data if pixel != (0, 0, 0, 255)]

    # Get bounding box of non-black pixels
    bbox = image.getbbox()

    # Crop the image using the bounding box
    cropped_image = image.crop(bbox)

    # Save the cropped image
    cropped_image.save(output_path)

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
        remove_black_border(input_path, output_path)

# Input and output folder paths
input_folder = "Output"
output_folder = "Output_No_Border"

# Remove black borders from images in the input folder and save them to the output folder
remove_black_borders_in_folder(input_folder, output_folder)
