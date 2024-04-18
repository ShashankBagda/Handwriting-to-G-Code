import os
from PIL import Image

def crop_image_from_border(image_path, crop_px):
    # Open the image
    img = Image.open(image_path)

    # Get image dimensions
    width, height = img.size

    # Define crop box (left, upper, right, lower)
    crop_box = (crop_px, crop_px, width - crop_px, height - crop_px)

    # Crop the image
    cropped_img = img.crop(crop_box)

    return cropped_img

def crop_images_in_folder(input_folder, output_folder, crop_pixels):
    # Create the output folder if it doesn't exist
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    # Iterate over each file in the input folder
    for filename in os.listdir(input_folder):
        if filename.endswith(('.png', '.jpg', '.jpeg')):
            input_image_path = os.path.join(input_folder, filename)
            output_image_path = os.path.join(output_folder, filename)
            
            # Crop the image
            cropped_image = crop_image_from_border(input_image_path, crop_pixels)

            # Save the cropped image
            cropped_image.save(output_image_path)

            # Display confirmation message
            print(f"Image {filename} cropped and saved successfully.")

# Example usage
input_folder = "Output"  # Input folder containing images to crop
output_folder = "Output"  # Output folder for cropped images
crop_pixels = 5  # Number of pixels to crop from each side

# Crop images in the input folder
crop_images_in_folder(input_folder, output_folder, crop_pixels)
