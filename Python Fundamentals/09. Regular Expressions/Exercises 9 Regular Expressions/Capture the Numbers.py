import re

def get_multiline_input():
    multiline_input = ''
    while True:
        s = input()
        if s != '':
            multiline_input += s + '\n'
        else:
            break
    return multiline_input

data = get_multiline_input()
pattern = r"\d+"

numbers = re.findall(pattern,data)
print(" ".join(numbers))