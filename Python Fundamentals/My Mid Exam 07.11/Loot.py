treasure_chest = input().split("|")
action = input()
sum =0

while action!="Yohoho!":
    command = action.split()[0]
    action1 = action.split()
    if command == "Loot":
        old_tresure_chest = treasure_chest.copy()
        for i in range(1,len(action1)):
            if not action.split()[i] in treasure_chest:
                treasure_chest.insert(0, action.split()[i])
    if command == "Drop":
        index = int(action.split()[1])
        if 0 <= index < len(treasure_chest):
            loot_to_remove = treasure_chest[index]
            treasure_chest.remove(loot_to_remove)
            treasure_chest.append(loot_to_remove)
    if command == "Steal":
        y=1
        number_el_to_delete = int(action.split()[1])
        stolen_items = []
        if len(treasure_chest) < number_el_to_delete:
            number_el_to_delete = len(treasure_chest)
        for i in range(number_el_to_delete):
            last_index = len(treasure_chest) - 1
            stolen_items.insert(0,treasure_chest[last_index])
            del treasure_chest[-1]
        #stolen_items1 = stolen_items.reverse()
        print(", ".join(stolen_items))
    action = input()

for el in range (len(treasure_chest)):
    sum += len(treasure_chest[el])

if len(treasure_chest) == 0:
    print("Failed treasure hunt.")
else:
    print(f"Average treasure gain: {sum/len(treasure_chest):.2f} pirate credits.")
# print(sum)
# print(treasure_chest)