wagons_number = int(input())
wagons=[]
for i in range(wagons_number):
    wagons.append(0)
action = input()

while action != "End":
    command = action.split()[0]
    if command == "add":
        number_to_add = int(action.split()[1])
        wagons[wagons_number-1] += number_to_add
    elif command == "insert":
        wagons[int(action.split()[1])] += int(action.split()[2])
    elif command == "leave":
        wagons[int(action.split()[1])] -= int(action.split()[2])
    action = input()

print(wagons)