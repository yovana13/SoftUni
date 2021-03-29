n = int(input())
plant_dist={}
rating_dict={}
for _ in range(n):
    plant_data = input()
    plant_dist[plant_data.split("<->")[0]]= plant_data.split("<->")[1]

data = input()
while data!="Exhibition":
    command = data.split(": ")[0]
    other_data = data.split(": ")[1]
    plant = other_data.split(" - ")[0]
    if command == "Rate":
        if plant not in rating_dict and plant in plant_dist:
            rating_dict[plant]=[]
            rating_dict[plant].append(int(other_data.split(" - ")[1]))
        elif plant in rating_dict and plant in plant_dist:
            rating_dict[plant].append(int(other_data.split(" - ")[1]))
        else:
            print("error")
    elif command=="Update":
        if plant not in plant_dist:
            print("error")
        else:
            plant_dist[plant] = other_data.split(" - ")[1]
    elif command=="Reset":
        if plant in plant_dist:
            rating_dict[plant] = []
        else:
            print("error")
    data = input()

new_dict={}
for key in plant_dist:
    if key in rating_dict and len(rating_dict[key])!=0:
        new_dict[key] = [plant_dist[key], sum(rating_dict[key])/len(rating_dict[key])]
    else:
        new_dict[key] = [plant_dist[key], 0]

new_dict= dict(sorted(new_dict.items(), key=lambda x: (x[1][0],x[1][1]),reverse=True))
print("Plants for the exhibition:")
for key in new_dict:
    print(f"- {key}; Rarity: {new_dict[key][0]}; Rating: {new_dict[key][1]:.2f}")