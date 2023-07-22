import os
from PIL import Image
from fontTools.ttLib import TTFont, TTLibError

# Define font properties
font_size = 48
output_font_path = "output.ttf"
images_folder = "Images"

def convert_png_to_ttf(images_folder, output_font_path):
    # Get all the PNG files in the specified folder
    png_files = [os.path.join(images_folder, file) for file in os.listdir(images_folder) if file.lower().endswith(".png")]

    # Create a blank TTF font
    font = TTFont()

    # Set the font properties
    font.sfntVersion = 0x10000  # TrueType font version
    font.numGlyphs = len(png_files)  # Number of glyphs in the font

    # Loop through the PNG files and convert them into TTF glyphs
    for index, png_file in enumerate(png_files):
        # Open the PNG file
        image = Image.open(png_file)

        # Resize the image to the desired font size
        image = image.resize((font_size, font_size))

        # Convert the image to a grayscale bitmap
        image = image.convert("L")

        # Convert the bitmap to a glyph and add it to the font
        glyph = image.tobytes(), image.size, (1, 0, 0, 1), 0
        font.setGlyph(str(index), glyph)

    try:
        # Save the TTF font to a file
        font.save(output_font_path)
        print("TTF font created successfully!")
    except TTLibError as e:
        print(f"An error occurred while saving the font: {e}")

# Convert the PNG files to TTF
convert_png_to_ttf(images_folder, output_font_path)
