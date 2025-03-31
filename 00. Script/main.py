import os
import shutil
import subprocess

src_folder = "C:/Users/Resurrected/Learn_Java/src"
repo_folder = "C:/Users/Resurrected/my/"

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

# try:
#     subprocess.run(["git", "add", "-A"], check=True, cwd=repo_folder)
#     subprocess.run(["git", "commit", "-m", folder_name], check=True, cwd=repo_folder)
#     subprocess.run(["git", "push", "-u", "origin", "main"], check=True, cwd=repo_folder)

#     print("Changes pushed successfully!")
# except subprocess.CalledProcessError as e:
#     print(f"Error: {e}")