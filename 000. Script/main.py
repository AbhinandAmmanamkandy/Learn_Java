import os
import shutil
import subprocess

# Ensure that the script uses the correct working directory
os.chdir(os.path.dirname(os.path.abspath(__file__)))

src_folder = "C:/Users/abhin/IdeaProjects/learn/src"
repo_folder = "C:/Users/abhin/my/"

folder_count = len(next(os.walk(repo_folder))[1]) - 1

folder_name = input("Enter folder name: ")
new_folder = f"{repo_folder}/{folder_count:02}. {folder_name}"
os.makedirs(new_folder, exist_ok=True)

for root, _, files in os.walk(src_folder):
    rel_path = os.path.relpath(root, src_folder)
    target_dir = os.path.join(new_folder, rel_path)
    os.makedirs(target_dir, exist_ok=True)
    
    for file in files:
        if not file.endswith(".class"):
            shutil.copy2(os.path.join(root, file), os.path.join(target_dir, file))

try:
    subprocess.run(["git", "add", "-A"], check=True, cwd=repo_folder)
    subprocess.run(["git", "commit", "-m", folder_name], check=True, cwd=repo_folder)
    subprocess.run(["git", "push", "-u", "origin", "main"], check=True, cwd=repo_folder)

    print("Changes pushed successfully!")
except subprocess.CalledProcessError as e:
    print(f"Error: {e}")

# Clean up src_folder (delete files and directories)
for item in os.listdir(src_folder):
    item_path = os.path.join(src_folder, item)
    if os.path.isdir(item_path):
        shutil.rmtree(item_path)
    else:
        os.remove(item_path)

# Use absolute path for the 'temp' directory
source_directory = os.path.join(os.path.dirname(os.path.abspath(__file__)), "temp")

# List of files to copy
files_to_copy = ["README.md"]

for filename in files_to_copy:
    source_path = os.path.join(source_directory, filename)
    destination_path = os.path.join(src_folder, filename)

    # Ensure the source file exists before copying
    if os.path.exists(source_path):
        shutil.copy2(source_path, destination_path)
    else:
        print(f"Warning: {source_path} does not exist.")