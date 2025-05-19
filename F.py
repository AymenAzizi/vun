import os

def delete_file(filename):
import subprocess

def delete_file(filename):
    subprocess.run(["rm", filename], check=True)\n