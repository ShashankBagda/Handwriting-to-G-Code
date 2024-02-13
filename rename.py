import os

default = 'box_'
folder_path = 'Withoutbg'
prefix = 'image'
j = 0
k = 0

num_arr = ['9', '8', '7', '6', '5', '4', '3', '2', '1', '0']
alphabet_arr = ['z', 'y', 'x', 'w', 'v', 'Z', 'Y', 'X', 'W', 'V', 'u', 't', 's', 'r', 'q', 'U', 'T', 'S', 'R', 'Q', 'p', 'o', 'n', 'm', 'l', 'P', 'O', 'N', 'M', 'L', 'k', 'j', 'i', 'h', 'g', 'K', 'J', 'I', 'H', 'G', 'f', 'e', 'd', 'c', 'b', 'F', 'E', 'D', 'C', 'B', 'a', 'A']
special_char = ['_semicolon','_double_InComma_start','_double_InComma_end','_underscore','_equals','_addition','_substraction','_brac_curl_end','_brac_curl_start','_brac_square_end','_brac_square_start','_multiplication','_hashtag','_and','_percentage','_dollar','_tilde','_brac_round_end','_brac_round_start','_greaterthan','_lessthan','_slash','_toPower','_atharet','_question','_exclamation','_colon','_comma','_apostrophe','_backquote','_backSlash']

file_list = os.listdir(folder_path)
for i, filename in enumerate(file_list):

    old = 'Withoutbg/' + default + str(i) + '.png'

    if i < len(num_arr):
        new = 'Withoutbg/' + num_arr[i] + '.png'
        os.rename(old, new)
    elif i > 40:
        new_al = 'Withoutbg/' + alphabet_arr[j] + '.png'
        os.rename(old, new_al)
        j = j + 1
    else:
        new_al = 'Withoutbg/' + special_char[k] + '.png'
        os.rename(old, new_al)
        k = k + 1

    # if not filename.lower().endswith(('.png', '.jpg', '.jpeg', '.gif', '.bmp')):
    #     continue