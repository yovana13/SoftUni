n = int(input())
dict_key = {}
dict_composer={}
for _ in range(n):
    data_piece = input()
    piece= data_piece.split("|")[0]
    dict_key[piece] = data_piece.split("|")[2]
    dict_composer[piece] = data_piece.split("|")[1]

data = input()
while data!="Stop":
    command = data.split("|")[0]
    new_piece = data.split("|")[1]
    if command =="Add":
        if new_piece in dict_composer:
            print(f"{new_piece} is already in the collection!")
        else:
            dict_composer[new_piece] = data.split("|")[2]
            dict_key[new_piece] = data.split("|")[3]
            print(f"{new_piece} by {dict_composer[new_piece]} in {dict_key[new_piece]} added to the collection!")
    elif command =="Remove":
        if new_piece in dict_composer:
            dict_composer.pop(new_piece)
            dict_key.pop(new_piece)
            print(f"Successfully removed {new_piece}!")
        else:
            print(f"Invalid operation! {new_piece} does not exist in the collection.")
    elif command=="ChangeKey":
        if new_piece in dict_composer:
            dict_key[new_piece] = data.split("|")[2]
            print(f"Changed the key of {new_piece} to {dict_key[new_piece]}!")
        else:
            print(f"Invalid operation! {new_piece} does not exist in the collection.")
    data = input()

sorted_composer_dict = dict(sorted(dict_composer.items(), key=lambda x:[x[0],x[1]]))
for key in sorted_composer_dict:
    print(f"{key} -> Composer: {sorted_composer_dict[key]}, Key: {dict_key[key]}")




