treasure_chest = input().split("|")
action = input()

while action!="Yohoho!":
    command = action.split()[0]
    if command == "Steal":
        y=1
        number_el_to_delete = int(action.split()[1])
        stolen_items = []
        if len(treasure_chest) < number_el_to_delete:
            number_el_to_delete = len(treasure_chest)
        for i in range(number_el_to_delete):
            last_index = len(treasure_chest) - 1
            stolen_items.append(treasure_chest[last_index])
            del treasure_chest[-1]
        print(", ".join(stolen_items))
    elif command == "Drop":
        index = int(action.split()[1])
        if 0 <= index < len(treasure_chest):
            loot_to_remove = treasure_chest[index]
            treasure_chest.remove(loot_to_remove)
            treasure_chest.append(loot_to_remove)
    elif command == "Loot":
        old_tresure_chest = treasure_chest.copy()
        for i in range(1, len(old_tresure_chest)):
            if not action.split()[i] in treasure_chest:
                treasure_chest.insert(0, action.split()[i])
    action = input()

print(treasure_chest)