import re
n = int(input())
pattern = r"\B@#+[A-Z][a-zA-Z0-9]{4,}[A-Z]@#+\B"
for i in range(n):
    line = input()
    match = re.findall(pattern, line)
    if match:
        print("Product group: ",end="")
        counter = 0
        for index in range(len(match[0])):
            if match[0][index].isdigit():
                print(match[0][index],end="")
                counter+=1
        if counter == 0:
            print("00",end="")
        print()
    else:
        print("Invalid barcode")