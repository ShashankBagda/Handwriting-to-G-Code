import os
import PIL.Image as Image
import svgwrite
import shutil

def convert_image_to_svg(image_path, output_folder):
    # Load the image
    image = Image.open(image_path)
    width, height = image.size

    # Create the output folder if it doesn't exist
    os.makedirs(output_folder, exist_ok=True)

    # Get the image filename without extension
    filename = os.path.splitext(os.path.basename(image_path))[0]

    # Create an SVG drawing
    svg_path = os.path.join(output_folder, f"{filename}.svg")
    drawing = svgwrite.Drawing(svg_path, size=(width, height))

    # Iterate over each pixel in the image
    for y in range(height):
        for x in range(width):
            # Get the RGBA values of the pixel
            rgba = image.getpixel((x, y))

            # Create a rectangle element with the corresponding color
            drawing.add(drawing.rect(insert=(x, y), size=(1, 1), fill=svgwrite.rgb(*rgba[:3])))

    # Save the SVG file
    drawing.save()

# Set the input and output folders
input_folder = "Withoutbg"
output_folder = "Output"

# Get the list of image files in the input folder
image_files = [f for f in os.listdir(input_folder) if f.endswith(".png")]

# Convert each image to SVG and save it to the output folder
for image_file in image_files:
    image_path = os.path.join(input_folder, image_file)
    convert_image_to_svg(image_path, output_folder)

shutil.rmtree(input_folder)