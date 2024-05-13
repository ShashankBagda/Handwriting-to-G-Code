import os
import shutil
from tkinter import *
from tkinter import messagebox
from PIL import Image, ImageTk

# Function to rename and move the image
def rename_image():
    selected_item = dropdown.get()
    if not selected_item:
        messagebox.showwarning("Warning", "Please select an item from the dropdown menu.")
        return

    source_path = os.path.join("Output", image_list[index])
    destination_path = os.path.join("Verified", f"{selected_item}.png")
    try:
        shutil.move(source_path, destination_path)
        messagebox.showinfo("Success", f"Image renamed and moved successfully as '{destination_path}'")
    except Exception as e:
        messagebox.showerror("Error", f"Error occurred: {str(e)}")

# Function to display the next image
def next_image():
    global index
    if index < len(image_list) - 1:
        index += 1
        load_image()
    else:
        messagebox.showinfo("Info", "No more images in the folder.")

# Function to display the previous image
def prev_image():
    global index
    if index > 0:
        index -= 1
        load_image()
    else:
        messagebox.showinfo("Info", "This is the first image.")

# Function to load and display the current image
def load_image():
    image_path = os.path.join("Output", image_list[index])
    image = Image.open(image_path)
    # image = image.resize((400, 400), Image.ANTIALIAS)
    image = image.resize((400, 400), Image.Resampling.LANCZOS)
    photo = ImageTk.PhotoImage(image)
    image_label.config(image=photo) # type: ignore
    image_label.image = photo # type: ignore
    dropdown.set("")
    selected_image_label.config(text=f"Selected Image: {image_list[index]}") # Update selected image label

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


delete_files_in_folder("Verified")

# Get list of images in the Output folder
image_list = os.listdir("Output")
index = 0

# Create main window
root = Tk()
root.title("Image Viewer")

# Dropdown menu
options = ['_full_stop','_double_InComma','_underscore','_equals','_addition','_substraction','_brac_curl_end','_brac_curl_start','_brac_square_end','_brac_square_start','_multiplication','_hashtag','_and','_percentage','_dollar','_tilde','_brac_round_end','_brac_round_start','_greaterthan','_lessthan','_slash','_toPower','_atharet','_question','_exclamation','_colon','_comma','_apostrophe','_backquote','_semicolon','_9', '_8', '_7', '_6', '_5', '_4', '_3', '_2', '_1', '_0','z','y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a', '_Z', '_Y', '_X', '_W', '_V', '_U', '_T', '_S', '_R', '_Q', '_P', '_O', '_N', '_M', '_L', '_K', '_J', '_I', '_H', '_G', '_F', '_E', '_D', '_C', '_B', '_A']  # Add your desired options here
dropdown = StringVar(root)
dropdown_menu = OptionMenu(root, dropdown, *options)
dropdown_menu.pack()

# Image display
image_label = Label(root)
image_label.pack()

# Selected image label
selected_image_label = Label(root, text="")
selected_image_label.pack()

# Buttons
prev_button = Button(root, text="Previous", command=prev_image)
prev_button.pack(side=LEFT, padx=10)

next_button = Button(root, text="Next", command=next_image)
next_button.pack(side=RIGHT, padx=10)

rename_button = Button(root, text="Rename", command=rename_image)
rename_button.pack(pady=10)

# Load and display the first image
if image_list:
    load_image()
else:
    messagebox.showinfo("Info", "No images found in the folder.")

root.mainloop()
