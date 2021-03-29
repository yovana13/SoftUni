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
        if energy > 100:
            print(f"You gained {number - (energy - 100)} energy.")
            energy = 100
        else:
            print(f"You gained {number} energy.")
        print(f"Current energy: {energy}.")
    elif action == "order" and energy>=30:
        energy -= 30
        coins += number
        print(f"You earned {number} coins.")
    elif action == "order" and energy < 30:
        energy += 50
        print("You had to rest!")
    else:
        if coins >= number:
            coins -= number
            print(f"You bought {action}.")
        else:
            print(f"Closed! Cannot afford {action}.")
            x = True
            break

if not x:
    print("Day completed!")
    print(f"Coins: {coins}")
    print(f"Energy: {energy}")