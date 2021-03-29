events = input().split("|")
energy = 100
coins = 100
x = False

for event in events:
    tokens = event.split("-")
    number = int(tokens[1])
    action = tokens[0]
    if action == "rest":
        temp = 0
        if energy + number > 100:
            temp = 100 - energy
            energy += temp
        else:
            energy += number
            temp = number
        print(f"You gained {temp} energy.")
        print(f"Current energy: {energy}.")
    elif action == "order" and energy>=30:
        energy -= 30
        coins += number
        print(f"You earned {number} coins.")
    elif action == "order" and energy < 30:
        energy += 50
        print("You had to rest!")
    else:
        if coins > number: # tuka mi bila greskata oti ja imase pisano >=
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