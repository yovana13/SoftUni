text = input()
letters = []
digits = []
other = []
for i in text:
    if i.isdigit():
        digits.append(i)
    elif i.isalpha():
        letters.append(i)
    else:
        other.append(i)

print("".join(digits))
print("".join(letters))
print("".join(other))