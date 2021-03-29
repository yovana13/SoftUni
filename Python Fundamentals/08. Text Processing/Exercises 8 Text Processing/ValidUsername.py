users_names_string = input()
users_name = users_names_string.split(", ")

for user in users_name:
    if 3<= len(user) <=16:
        counter=0
        for symbol in user:
            if symbol.isalpha() or symbol.isdigit() or symbol=="-" or symbol=="_":
                counter+=1
        if counter == len(user):
            print(user)