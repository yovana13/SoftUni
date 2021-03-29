import re

data = input()
patter = r"(^|(?<=\s))-?\d+(\.\d+)?($|(?=\s))"
matces = re.finditer(patter,data)

for matc in matces:
    print(matc.group(0),end=" ")