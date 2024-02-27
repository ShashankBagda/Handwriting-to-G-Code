from PIL import Image
import os
import subprocess
import shutil

def remove_white_background(image_path, output_path):
    image = Image.open(image_path)
    image = image.convert("RGBA")

    data = image.getdata()

    new_data = []
    for item in data:
        if item[0] > 200 and item[1] > 200 and item[2] > 200:
            new_data.append((255, 255, 255, 0))  # Set the pixel to transparent
        else:
            new_data.append(item)

    # Update the image with the new data
    image.putdata(new_data)

    # Save the image with a transparent background
    image.save(output_path, "PNG")

def process_images_in_folder(input_folder, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    for filename in os.listdir(input_folder):
        if filename.endswith(".png") or filename.endswith(".jpg") or filename.endswith(".jpeg"):
            input_path = os.path.join(input_folder, filename)
            output_path = os.path.join(output_folder, filename)
            remove_white_background(input_path, output_path)

input_folder = "Images"
output_folder = "Output"

process_images_in_folder(output_folder, output_folder)

# shutil.rmtree(input_folder)