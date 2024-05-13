import os
import shutil

def move_files(source_dir, destination_dir):
    # Check if source directory exists
    if not os.path.exists(source_dir):
        print(f"Source directory '{source_dir}' does not exist.")
        return
    
    # Create destination directory if it doesn't exist
    if not os.path.exists(destination_dir):
        os.makedirs(destination_dir)

    # Iterate over files in source directory
    for filename in os.listdir(source_dir):
        source_file = os.path.join(source_dir, filename)
        if os.path.isfile(source_file):
            destination_file = os.path.join(destination_dir, filename)
            shutil.move(source_file, destination_file)
            print(f"Moved '{filename}' to '{destination_dir}'.")

# Call the function to move files
move_files("Output", "Verified")
