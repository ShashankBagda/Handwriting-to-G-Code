from docx import Document
from docx.shared import Inches

# Function to read text from a Docx file
def read_text_from_docx(file_path):
    doc = Document(file_path)
    text = ""
    for paragraph in doc.paragraphs:
        text += paragraph.text + "\n"
    return text

# Mapping special characters
special_chars = {
    '_semicolon': ';',
    '_full_stop': '.',
    '_double_InComma': '"',
    '_underscore': '_',
    '_equals': '=',
    '_addition': '+',
    '_substraction': '-',
    '_brac_curl_end': '}',
    '_brac_curl_start': '{',
    '_brac_square_end': ']',
    '_brac_square_start': '[',
    '_multiplication': '*',
    '_hashtag': '#',
    '_and': '&',
    '_percentage': '%',
    '_dollar': '$',
    '_tilde': '~',
    '_brac_round_end': ')',
    '_brac_round_start': '(',
    '_greaterthan': '>',
    '_lessthan': '<',
    '_slash': '/',
    '_toPower': '^',
    '_atharet': '@',
    '_question': '?',
    '_exclamation': '!',
    '_colon': ',',
    '_comma': ',',
    '_apostrophe': "'",
    '_backquote': '`',
    '_backSlash': '\\'
}

# Mapping special characters
capital_char = {
    '_A': 'A',
    '_B': 'B',
    '_C': 'C',
    '_D': 'D',
    '_E': 'E',
    '_F': 'F',
    '_G': 'G',
    '_H': 'H',
    '_I': 'I',
    '_J': 'J',
    '_K': 'K',
    '_L': 'L',
    '_M': 'M',
    '_N': 'N',
    '_O': 'O',
    '_P': 'P',
    '_Q': 'Q',
    '_R': 'R',
    '_S': 'S',
    '_T': 'T',
    '_U': 'U',
    '_V': 'V',
    '_W': 'W',
    '_X': 'X',
    '_Y': 'Y',
    '_Z': 'Z',
}

input_docx = "Input.docx"
text = read_text_from_docx(input_docx)
output_doc = Document()

for char in text:
    if char == '\n':
        #file_name = "Output/Enter.png"
        continue
    elif char == ' ':
        file_name = "space.png"
    elif char in special_chars.values():
        for special_char, filename in special_chars.items():
            if char == filename:
                file_name = f"Output/{special_char}.png"
                break
    for capital_key, capital_value in capital_char.items():
        if char == capital_value:
            file_name = f"Output/{capital_key}.png"
            break

    else:
        file_name = f"Output/{char}.png"

    output_doc.add_picture(file_name, width=Inches(1))

output_doc.save("Output.docx")

print("Words Embedded Successfully...")