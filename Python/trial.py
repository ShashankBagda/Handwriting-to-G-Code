import cv2
import os

def extract_squares(image_path, output_dir):
  """Extracts squares from an image and saves them as separate images in reading order.

  Args:
    image_path: Path to the input image.
    output_dir: Directory to save the extracted squares.
  """

  # Read the image
  image = cv2.imread(image_path)

  # Denoise the image (replace with your preferred denoising method)
  denoised_image = cv2.fastNlMeansDenoisingColored(image, None, 100, 100, 99, 101)

  # Show original and denoised images (optional)
  cv2.imshow("Original Image", image)
  cv2.imshow("Denoised Image", denoised_image)
  cv2.waitKey(0)  # Wait for a key press to close windows

  # Rest of the code for processing... (already defined in your previous code)

# Example usage
image_path = "AI Project Data/shashank.jpg"
output_dir = "Output"
extract_squares(image_path, output_dir)
