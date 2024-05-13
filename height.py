from PIL import Image
import os

def resize_images(input_folder, output_folder, new_height):
  """
  Resizes the height of all images in the input folder and saves them in the output folder.

  Args:
      input_folder (str): Path to the folder containing the images to be resized.
      output_folder (str): Path to the folder where the resized images will be saved.
      new_height (int): The desired height for the resized images.
  """

  # Create the output folder if it doesn't exist
  os.makedirs(output_folder, exist_ok=True)

  for filename in os.listdir(input_folder):
    if filename.lower().endswith((".jpg", ".jpeg", ".png")):
      # Get the full path of the input image
      input_path = os.path.join(input_folder, filename)

      try:
        # Open the image using Pillow
        img = Image.open(input_path)

        # Get the original width and height
        width, height = img.size

        # Calculate the new width to maintain aspect ratio
        new_width = int((width * new_height) / height)

        # Resize the image
        resized_img = img.resize((new_width, new_height), Image.BICUBIC) # type: ignore

        # Create the output filename (optional: add prefix or suffix)
        output_filename = os.path.join(output_folder, filename)

        # Save the resized image
        resized_img.save(output_filename)
        print(f"Resized '{filename}' to {new_width}x{new_height}")

      except (IOError, OSError) as e:
        print(f"Error processing '{filename}': {e}")

# Example usage
input_folder = "Data/English/Digital"  # Replace with your actual folder path
output_folder = "Output"  # Replace with your desired output folder
new_height = 250  # Set your desired new height

resize_images(input_folder, output_folder, new_height)
