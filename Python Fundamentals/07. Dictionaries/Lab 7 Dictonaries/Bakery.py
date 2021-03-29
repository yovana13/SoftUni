data = input().split()
produscts = {}

for index in range(0, len(data),2):
    key = data[index]
    value = int(data[index + 1])
    produscts[key] = value

print(produscts)