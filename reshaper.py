import cv2

def crop_to_foreground(image_path):
    """
    Crops an image to its foreground, removing background pixels.

    Args:
        image_path: Path to the image file.

    Returns:
        A cropped image with transparent background (if format supports) or
        a black background otherwise.
    """
    # Read the image
    image = cv2.imread(image_path)

    # Convert to grayscale for simpler processing
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # Apply thresholding to separate foreground from background
    # You might need to adjust the threshold value for different images
    thresh = cv2.threshold(gray, 230, 255, cv2.THRESH_BINARY)[1]

    # Find contours around the foreground objects
    contours, _ = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    # Find the largest contour (assuming it's the main object)
    largest_contour = max(contours, key=cv2.contourArea)

    # Get bounding rectangle around the largest contour
    x, y, w, h = cv2.boundingRect(largest_contour)

    # Crop the image using the bounding rectangle
    cropped_image = image[y:y+h, x:x+w]

    # Check if image format supports transparency (e.g., PNG)
    if cv2.IMREAD_UNCHANGED & cv2.imread(image_path)[1]:
        # Create a mask with transparent background for the cropped area
        mask = cv2.cvtColor(thresh, cv2.COLOR_GRAY2BGRA)
        mask[y:y+h, x:x+w, 0:3] = (255, 255, 255)  # Set non-foreground pixels to white (transparent)
        cropped_image = cv2.bitwise_and(cropped_image, mask)
    else:
        # Add a black background if format doesn't support transparency
        cropped_image = cv2.copyMakeBorder(cropped_image, 0, 0, 0, 0, cv2.BORDER_CONSTANT, value=(0, 0, 0))

    return cropped_image

# Example usage
image_path = "Output/_A.png"
cropped_image = crop_to_foreground(image_path)

# Save the cropped image (adjust output format if needed)
cv2.imwrite("cropped_image.jpg", cropped_image)