data = input().split()
produscts = {}

for index in range(0, len(data),2):
    key = data[index]
    value = int(data[index + 1])
    produscts[key] = value

products_to_search = input().split()

for product in products_to_search:
    if product in produscts:
        print(f"We have {produscts[product]} of {product} left")
    else:
        print(f"Sorry, we don't have {product}")