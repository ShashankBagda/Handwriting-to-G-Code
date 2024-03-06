import os

default = 'box_'
folder_path = 'Output'

names = ['_full_stop','_double_InComma','_underscore','_equals','_addition','_substraction','_brac_curl_end','_brac_curl_start','_brac_square_end','_brac_square_start','_multiplication','_hashtag','_and','_percentage','_dollar','_tilde','_brac_round_end','_brac_round_start','_greaterthan','_lessthan','_slash','_toPower','_atharet','_question','_exclamation','_colon','_comma','_apostrophe','_backquote','_semicolon','9', '8', '7', '6', '5', '4', '3', '2', '1', '0','z','y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a', '_Z', '_Y', '_X', '_W', '_V', '_U', '_T', '_S', '_R', '_Q', '_P', '_O', '_N', '_M', '_L', '_K', '_J', '_I', '_H', '_G', '_F', '_E', '_D', '_C', '_B', '_A']
# print(len(names))

file_list = os.listdir(folder_path)
for i, filename in enumerate(file_list):

    old = 'Output/' + default + str(i) + '.png'
    new = 'Output/' + names[i] + '.png'
    os.rename(old, new)

print("Renamed Successfully...")