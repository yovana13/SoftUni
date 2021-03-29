data = input()
dict_comapany = {}

while data!="End":
    company = data.split(" -> ")[0]
    id = data.split(" -> ")[1]
    if company not in dict_comapany:
        dict_comapany[company] = []
    if id not in dict_comapany[company]:
        dict_comapany[company].append(id)
    data = input()

dict_comapany = dict(sorted(dict_comapany.items(), key=lambda x: x[0]))
for key in dict_comapany:
    print(f"{key}")
    for i in range(len(dict_comapany[key])):
        print(f"-- {dict_comapany[key][i]}")

