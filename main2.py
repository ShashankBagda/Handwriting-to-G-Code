import cv2
import os
import numpy as np
import subprocess


def find_squares(image):
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    blurred = cv2.GaussianBlur(gray, (5, 5), 0)
    edged = cv2.Canny(blurred, 50, 150)

    contours, _ = cv2.findContours(edged.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    squares = []
    for contour in contours:
        peri = cv2.arcLength(contour, True)
        approx = cv2.approxPolyDP(contour, 0.02 * peri, True)
        if len(approx) == 4:
            squares.append(approx)
    return squares

def extract_and_save_squares(image_path):
    image = cv2.imread(image_path)
    squares = find_squares(image)
    for i, square in enumerate(squares):
        x, y, w, h = cv2.boundingRect(square)
        square_img = image[y:y+h, x:x+w]
        cv2.imwrite(f'Output/box_{i}.png', square_img)

if __name__ == "__main__":
    image_path = 'hand.png'  # Replace with your image file path
    extract_and_save_squares(image_path)
    # subprocess.run(['python3', 'removebg.py'])
    # subprocess.run(['python3', 'rename.py'])
    # subprocess.run(['python3', 'embedder.py'])
