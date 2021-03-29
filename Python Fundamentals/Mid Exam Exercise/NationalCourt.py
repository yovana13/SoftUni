first_empl = int(input())
second_empl = int(input())
third_empl = int(input())
people_per_hour = first_empl + second_empl + third_empl
all_people = int(input())

hours = 0

while all_people > 0:
    hours += 1
    all_people -= people_per_hour

    if hours % 4 == 0:
        hours += 1

print(f"Time needed: {hours}h.")
