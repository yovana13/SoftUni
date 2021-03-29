list = input().split()
pair_inpur = input()
counter = 1

while pair_inpur!="end":
    first_pair = int(pair_inpur.split()[0])
    second_pair = int(pair_inpur.split()[1])
    p = 0
    if not (len(list) > first_pair >= 0) and (len(list) > second_pair >=0):
        print("Invalid input! Adding additional elements to the board")
        obj = "-" + str(counter) + "a"
        index = int((len(list)+1)/2)
        list.insert(index, obj)
        list.insert(index + 1, obj)
        p=1
    elif first_pair == second_pair and p==0:
        print("Invalid input! Adding additional elements to the board")
        obj = "-" + str(counter) + "a"
        index = int((len(list) + 1) / 2)
        list.insert(index, obj)
        list.insert(index + 1, obj)
    else:
        if list[first_pair] == list[second_pair]:
            print(f"Congrats! You have found matching elements - {list[first_pair]}!")
            removed = list[first_pair]
            list.remove(removed)
            list.remove(removed)

        else:
            print("Try again!")
        if len(list) == 0:
            print(f"You have won in {counter} turns!")
            break
    pair_inpur = input()
    counter += 1

if len(list) != 0:
    print("Sorry you lose :(")
    print(' '.join(list))