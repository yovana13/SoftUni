message = input()

data = input()
while data!="Decode":
    command = data.split("|")[0]
    if command == "Move":
        length = int(data.split("|")[1])
        new = message[length:] + message[0:length]
        message = new
    elif command=="Insert":
        index = int(data.split("|")[1])
        value = data.split("|")[2]
        new = message[0:index] + value + message[index:]
        message = new
    elif command=="ChangeAll":
        old = data.split("|")[1]
        new = data.split("|")[2]
        new = message.replace(old,new)
        message = new
    data = input()

print(f"The decrypted message is: {message}")