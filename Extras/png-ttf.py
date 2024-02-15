import fontforge

# Function to create a new glyph in the font
def create_glyph(font, glyph_name, png_file):
    glyph = font.createChar(-1, glyph_name)  # Create a new glyph with a given name
    glyph.importOutlines(png_file)  # Import the outlines from the PNG file

# Main function to create the font
def create_font(png_files, output_ttf_file):
    font = fontforge.font()  # Create a new empty font

    # Set font properties (e.g., fontname, familyname, etc.)
    font.fontname = "MyHandwrittenFont"
    font.familyname = "My Handwritten Font"
    font.fullname = "My Handwritten Font Regular"

    for i, png_file in enumerate(png_files):
        glyph_name = f"uni{10000 + i}"  # Create glyph names like "uni10001", "uni10002", ...
        create_glyph(font, glyph_name, png_file)

    font.generate(output_ttf_file)  # Generate the final font file

if __name__ == "__main__":
    png_files = [
        "path/to/letter_a.png",
        "path/to/letter_b.png",
        # Add paths for other PNG files here
    ]
    output_ttf_file = "path/to/your/output/font.ttf"
    create_font(png_files, output_ttf_file)
