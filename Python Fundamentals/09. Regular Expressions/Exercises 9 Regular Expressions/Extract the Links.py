import re

pattern = r"(^|(?<=\s))www\.[A-Za-z0-9-]+(\.[a-z]+)+"
line = input()
valid = []

while line:
    result = re.finditer(pattern, line)
    for el in result:
        print(el.group(0))
    line = input()

print(*valid,"\n")