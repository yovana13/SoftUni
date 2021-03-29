events = input().split("|")
energy = 100
coins = 100
x = False

for index in range(len(events)):
    if x:
        break
    action = events[index].split("-")[0]
    number = int(events[index].split("-")[1])
    if action == "rest":
        energy += number
        if energy>100:
            print(f"You gained {number - (energy - 100)} energy.")
            energy = 100 #vidi tuka ako imam 80 i dodadam 30 dali gained energy ke e 20
        else:
            print(f"You gained {number} energy.")
        print(f"Current energy: {energy}.")
    elif action == "order":
        if energy >= 30:
            energy -= 30
            coins += number
            print(f"You earned {number} coins.")
            # energy -= 30
            # coins += number
            # print(f"You earned {number} coins.")
        else:
            energy += 50
            print("You had to rest!")
    else:
        if coins >= number:
            print(f"You bought {action}.")
        else:
            print(f"Closed! Cannot afford {action}.")
            x = True
            break

print(f"Coins: {coins}")
print(f"Energy: {energy}")