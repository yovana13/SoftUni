items = {"shards":"Shadowmourne", "fragments":"Valanyr", "motes":"Dragonwrath"}
key_materials = {"shards":0, "fragments":0, "motes":0}
junks = {}
has_winner = False

data = input().split()
while not has_winner:
    for i in range(0,len(data),2):
        material = data[i+1].lower()
        quantity = int(data[i])
        if material in key_materials:
            key_materials[material] += quantity
            if key_materials[material] >=250:
                print(f"{items[material]} obtained!")
                key_materials[material] -= 250
                has_winner = True
                break
        else:
            if material not in junks:
                junks[material] = quantity
            else:
                junks[material] += quantity
    if has_winner:
        break
    data = input().split()

sorted_key_materials = sorted(key_materials.items(),key=lambda x: (-x[1], x[0]))
for key,item in sorted_key_materials:
    print(f"{key}: {item}")

sorted_junks = sorted(junks.items(),key=lambda x: x[0])
for key,item in sorted_junks:
    print(f"{key}: {item}")