import os

default = 'box_'
folder_path = 'Withoutbg'
prefix = 'image'
j = 0

num_arr = ['9', '8', '7', '6', '5', '4', '3', '2', '1', '0']
alphabet_arr = ['z', 'y', 'x', 'w', 'v', 'Z', 'Y', 'X', 'W', 'V', 'u', 't', 's', 'r', 'q', 'U', 'T', 'S', 'R', 'Q', 'p', 'o', 'n', 'm', 'l', 'P', 'O', 'N', 'M', 'L', 'k', 'j', 'i', 'h', 'g', 'K', 'J', 'I', 'H', 'G', 'f', 'e', 'd', 'c', 'b', 'F', 'E', 'D', 'C', 'B', 'a', 'A']

file_list = os.listdir(folder_path)
for i, filename in enumerate(file_list):
    # print(i)
    old = 'Withoutbg/' + default + str(i) + '.png'

    if i < len(num_arr):
        new = 'Withoutbg/' + num_arr[i] + '.png'
        os.rename(old, new)
    elif i > 40:
        new_al = 'Withoutbg/' + alphabet_arr[j] + '.png'
        os.rename(old, new_al)
        j = j + 1

    if not filename.lower().endswith(('.png', '.jpg', '.jpeg', '.gif', '.bmp')):
        continue
