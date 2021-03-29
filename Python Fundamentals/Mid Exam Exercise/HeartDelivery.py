from typing import List


def mission(list_of_hearts):
    counter = 0
    for el in list_of_hearts:
        if el != 0:
            counter += 1
    return counter


input1 = input()

list_of_hearts1 = input1.split("@")
list_of_hearts = [int(numeric_string) for numeric_string in list_of_hearts1]
last_position = 0

input2 = input()
while input2 != "Love!":
    jump_steps = input2.split()[1]
    last_position = last_position + int(jump_steps)
    if last_position >= len(list_of_hearts):
        last_position = 0
    if list_of_hearts[last_position] != 0:
        list_of_hearts[last_position] -= 2
        if list_of_hearts[last_position] == 0:
            print(f"Place {last_position} has Valentine's day.")
    else:
        print(f"Place {last_position} already had Valentine's day.")

    input2 = input()

print(f"Cupid's last position was {last_position}.")
if mission(list_of_hearts) == 0:
    print("Mission was successful")
else:
    print(f"Cupid has failed {mission(list_of_hearts)} places.")
