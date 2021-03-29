dict = {}
text = input()
for i in range(0, len(text)):
    if text[i]!=" ":
        if text[i] in dict:
            dict[text[i]] +=1
        else:
            dict[text[i]] = 1
for key in dict.keys():
    print(f"{key} -> {dict[key]}")