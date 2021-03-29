list_cards = input().split(":")
new_list_cards = []
action = input()

while action!="Ready":
    command = action.split()[0]
    if action == "Shuffle deck":
        new_list_cards.reverse()
    if command == "Add":
        if action.split()[1] in list_cards:
            new_list_cards.append(action.split()[1])
        else:
            print("Card not found.")
    elif command == "Insert":
        index = int(action.split()[2])
        if action.split()[1] in list_cards:
            if index == 0:
                new_list_cards.insert(index,action.split()[1])
            elif 0<index<len(new_list_cards):
                new_list_cards.insert(index, action.split()[1])
            else:
                print("Error!")
        else:
            print("Error!")
    elif command == "Remove":
        if action.split()[1] in new_list_cards:
            new_list_cards.remove(action.split()[1])
        else:
            print("Card not found.")
    elif command == "Swap":
        index1=new_list_cards.index(action.split()[1])
        index2 = new_list_cards.index(action.split()[2])
        temp = new_list_cards[index1]
        new_list_cards[index1] = new_list_cards[index2]
        new_list_cards[index2] = temp

    action = input()

print(" ".join(new_list_cards))