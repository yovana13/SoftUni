n = int(input())
cars_dict = {}

for _ in range(n):
    data  = input().split()
    command = data[0]
    user = data[1]
    if command == "register":
        plate_number = data[2]
        if user not in cars_dict:
            cars_dict[user] = plate_number
            print(f"{user} registered {plate_number} successfully")
        else:
            print(f"ERROR: already registered with plate number {plate_number}")
    elif command == "unregister":
        if user not in cars_dict:
            print(f"ERROR: user {user} not found")
        else:
            cars_dict.pop(user)
            print(f"{user} unregistered successfully")

for key in cars_dict:
    print(f"{key} => {cars_dict[key]}")