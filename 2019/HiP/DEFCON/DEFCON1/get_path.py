import numpy as np
from PIL import Image

# Load image
imgpil = Image.open("result_violet_modified.png")  
image = np.array(imgpil)

# Path len and starting point
path_len = 2703
curr_coor = (79,75)
path = ""

# Retrieve the next white cell, update the path, paint the visited cell, and update the current cell
for i in range(path_len):
    x,y = curr_coor
    # Right
    if np.array_equal(image[x+1,y],[255,255,255]) or np.array_equal(image[x+1,y],[1,1,255]):
        path += 'r'
        image[x+1,y] = [0,255,0]
        curr_coor = (x+1,y)
    # Left
    if np.array_equal(image[x-1,y],[255,255,255]) or np.array_equal(image[x-1,y],[1,1,255]):
        path += 'l'
        image[x-1,y] = [0,255,0]
        curr_coor = (x-1,y)
    # Down
    if np.array_equal(image[x,y+1],[255,255,255]) or np.array_equal(image[x,y+1],[1,1,255]):
        path += 'd'
        image[x,y+1] = [0,255,0]
        curr_coor = (x,y+1)
    # Up
    if np.array_equal(image[x,y-1],[255,255,255]) or np.array_equal(image[x,y-1],[1,1,255]):
        path += 'u'
        image[x,y-1] = [0,255,0]
        curr_coor = (x,y-1)
    print(curr_coor)

print(path)
