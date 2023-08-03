import os
import fontforge

def create_custom_font_from_images(image_folder, font_path, character_set=None, font_size=32):
    if not character_set:
        character_set = "".join(chr(i) for i in range(32, 127))  # ASCII printable characters

    font = fontforge.font()
    
    for filename in os.listdir(image_folder):
        character = os.path.splitext(filename)[0]
        if len(character) == 1 and character in character_set:
            image_path = os.path.join(image_folder, filename)
            try:
                glyph = font.createChar(ord(character))
                glyph.importOutlines(image_path)
                glyph.width = font_size
            except Exception as e:
                print(f"Error: Could not process image '{image_path}': {e}")

    font.generate(font_path)
    print(f"Custom font generated and saved as '{font_path}'.")

if __name__ == "__main__":
    # Example usage:
    images_folder = "path/to/images_folder"
    custom_font_output_path = "custom_font.ttf"
    character_set = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

    create_custom_font_from_images(images_folder, custom_font_output_path, character_set)
