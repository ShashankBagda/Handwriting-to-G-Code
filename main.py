import cv2
import os
import numpy as np
import subprocess
import shutil
import time

def delete_files_in_folder(folder_path):
    try:
        # List all files in the specified folder
        files = os.listdir(folder_path)
        
        # Iterate over each file and delete it
        for file in files:
            file_path = os.path.join(folder_path, file)
            if os.path.isfile(file_path):
                os.remove(file_path)
                print(f"Deleted file: {file_path}")
        
        print("All files in the folder have been deleted.")
    except Exception as e:
        print(f"An error occurred: {e}")
        
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

def extract_and_save_squares(image_path, border_margin=5):
    image = cv2.imread(image_path)
    squares = find_squares(image)
    for i, square in enumerate(squares):
        x, y, w, h = cv2.boundingRect(square)
        # Add margin to remove the border
        x += border_margin
        y += border_margin
        w -= 2 * border_margin
        h -= 2 * border_margin
        square_img = image[y:y+h, x:x+w]
        cv2.imwrite(f'Output/box_{i}.png', square_img)


if __name__ == "__main__":

    folder_path = "Output" 
    delete_files_in_folder(folder_path)

    image_path = 'digital.png'
    extract_and_save_squares(image_path)

    print("Images Extracted Successfully...")
    time.sleep(3)
    
    subprocess.run(['python3', 'removebg.py'])
    time.sleep(3)

    subprocess.run(['python3', 'rename.py'])
    time.sleep(3)

    # subprocess.run(['python3', 'embedder.py'])
