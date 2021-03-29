import re
pattern = r"(?P<separator>@|\*)(?P<word>[A-Z][a-z]{2,})(?P=separator):\s\[(?P<c1>[a-zA-Z])\]\|\[(?P<c2>[a-zA-Z])\]\|\[(?P<c3>[a-zA-Z])\]\|$"
n = int(input())
for _ in range(n):
    data = input()
    match = re.findall(pattern, data)
   # print(match)
    if not match:
        print("Valid message not found!")
    else:
        print(f"{match[0][1]}: {ord(match[0][2])} {ord(match[0][3])} {ord(match[0][4])}")
