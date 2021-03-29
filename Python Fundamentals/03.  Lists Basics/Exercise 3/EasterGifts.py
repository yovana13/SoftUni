gifts = input().split()
command = input()

while command!="No Money":
    method = command.split()[0]
    if method=="OutOfStock":
        for index in range(len(gifts)):
            if gifts[index] == command.split()[1]:
                gifts[index] = "None"
    elif method == "Required":
        index = int(command.split()[2])
        if len(gifts) > index >= 0:
            gifts[index] = command.split()[1]
    elif method=="JustInCase":
        gifts[-1] = command.split()[1]
    command = input()

for el in gifts:
    if el == "None":
        gifts.remove(el)
print(" ".join(gifts))
