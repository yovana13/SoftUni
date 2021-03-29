fires = input().split("#")
water = int(input())
effort = 0
total_fire = 0
print("Cells:")

for index in range(len(fires)):
    x = False
    type_of_fire = fires[index].split()[0]
    fire_level = int(fires[index].split()[2])
    if type_of_fire == "Low" and 1 <= fire_level <= 50:
        x= True
    elif type_of_fire == "Medium" and 51 <= fire_level <= 80:
        x = True
    elif type_of_fire == "High" and 81 <= fire_level <= 125:
        x = True
    if x:
        if water - fire_level >= 0:
            water -= fire_level
            total_fire += fire_level
            print(f" - {fire_level}")
print(f"Effort: {total_fire * 25 / 100:.2f}")
print(f"Total Fire: {total_fire}")
