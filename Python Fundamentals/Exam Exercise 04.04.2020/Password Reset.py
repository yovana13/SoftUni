password = input()
line = input()

while line!="Done":
    command = line.split()[0]
    new_pass=""
    if command=="TakeOdd":
        for i in range(1,len(password),2):
            new_pass = new_pass+password[i]
        print(new_pass)
    elif command=="Cut":
        ind = int(line.split()[1])
        length = int(line.split()[2])
        new_pass = password[0:ind] + password[ind+length:len(password)]
        print(new_pass)
    elif command=="Substitute":
        old=line.split()[1]
        new = line.split()[2]
        if old in password:
            new_pass = password.replace(old,new)
            print(new_pass)
        else:
            print("Nothing to replace!")
            new_pass = password
    password = new_pass
    line = input()

print(f"Your password is: {new_pass}")