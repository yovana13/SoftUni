dict_all = {}
unliked_meals = 0
data = input()
while data!="Stop":
    command = data.split("-")[0]
    guest = data.split("-")[1]
    meal = data.split("-")[2]
    if command == "Like":
        if guest not in dict_all:
            dict_all[guest]=[]
            dict_all[guest].append(meal)
        else:
            if meal not in dict_all[guest]:
                dict_all[guest].append(meal)
    elif command=="Unlike":
        if guest not in dict_all:
            print(f"{guest} is not at the party.")
        else:
            if meal not in dict_all[guest]:
                print(f"{guest} doesn't have the {meal} in his/her collection.")
            else:
                print(f"{guest} doesn't like the {meal}.")
                dict_all[guest].remove(meal)
                unliked_meals += 1
    data = input()

new_dict ={}
for key in dict_all:
    new_dict[key] = len(dict_all[key])

sorted_dict = dict(sorted(new_dict.items(),key=lambda x:(-x[1],x[0])))

for key in sorted_dict:
    if sorted_dict[key]>0:
        print(f"{key}: {', '.join(dict_all[key])}")
    else:
        print(f"{key}:")
print(f"Unliked meals: {unliked_meals}")
