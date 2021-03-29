password = input()
password_str = str(password)
n=0
digit =0
other_symbols =0

if 6<=len(password)<=10:
    n+=1
else:
    print("Password must be between 6 and 10 characters")

for i in range(len(password_str)):
    if password_str[i].isalpha():
        pass
    elif password_str[i].isdigit():
        digit += 1
    else:
        if other_symbols == 0:
            other_symbols += 1
            print("Password must consist only of letters and digits")

if digit>=2 and other_symbols==0:
    if n==1:
        print("Password is valid")
if digit<2:
    print("Password must have at least 2 digits")


