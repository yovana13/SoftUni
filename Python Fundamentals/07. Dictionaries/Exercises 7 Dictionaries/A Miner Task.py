dict = {}
text = input()
i=1

while text!="stop":
    if i%2==0:
        text = int(text)
        if key in dict:
            dict[key] = dict[key] + text
        else:
            dict[key] = text
    else:
        key = text
    text = input()
    i +=1

for key in dict:
    print(f"{key} -> {dict[key]}")