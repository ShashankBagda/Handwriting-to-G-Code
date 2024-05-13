from PIL import Image
import os

def trim_horizontal_images(input_folder, output_folder):
    # Ensure output folder exists
    os.makedirs(output_folder, exist_ok=True)

    # Loop through all files in the input folder
    for filename in os.listdir(input_folder):
        # Check if the file is an image
        if filename.endswith(".jpg") or filename.endswith(".png") or filename.endswith(".jpeg"):
            # Open the image
            image_path = os.path.join(input_folder, filename)
            image = Image.open(image_path)

            # Trim the image horizontally
            image = image.crop(image.getbbox())

            # Save the trimmed image to the output folder
            output_path = os.path.join(output_folder, filename)
            image.save(output_path)
            print(f"Trimmed {filename} horizontally and saved to {output_path}")

# Example usage
folder = "Output"
trim_horizontal_images(folder, folder)
