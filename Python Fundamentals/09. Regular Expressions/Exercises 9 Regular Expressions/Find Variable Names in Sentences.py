import re

data = input()
pattern = r"\b_(?P<variable>[a-zA-Z0-9]+)\b"
varables = re.finditer(pattern, data)

list = []
for variable in varables:
    valid_variable = variable.groupdict()["variable"]
    list.append(valid_variable)
print(",".join(list))
