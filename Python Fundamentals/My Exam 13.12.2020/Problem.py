username= input()
data = input()
while data!="Sign up":
    command = data.split()[0]
    if command=="Case":
        if data.split()[1]=="lower":
            username = username.lower()
        else:
            username = username.upper()
        print(username)
    elif command=="Reverse":
        index_end = int(data.split()[1])
        index_start = int(data.split()[2])
        if 0<=index_end<len(username) and 0<=index_start<len(username):
            for i in range(index_start,index_end-1,-1):
                print(username[i],end="")
            print()
    elif command=="Cut":
        cut = data.split()[1]
        if cut in username:
            username = username.replace(cut,"")
            print(username)
        else:
            print(f"The word {username} doesn't contain {cut}.")
    elif command=="Replace":
        to_replace= data.split()[1]
        if to_replace in username:
            username = username.replace(to_replace,"*")
            print(username)
    elif command=="Check":
        to_check = data.split()[1]
        if to_check in username:
            print("Valid")
        else:
            print(f"Your username must contain {to_check}.")
    data=input()