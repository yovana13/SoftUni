product_data = input()

products = {}

while product_data!="statistics":
    product = product_data.split(": ")[0]
    quantity = int(product_data.split(": ")[1])
    if product in products:
        products[product] += quantity
    else:
        products[product] = quantity
    product_data = input()

print("Products in stock:")
for key, value in products.items():
    print(f"- {key}: {value}")
print(f"Total Products: {len(products)}")
print(f"Total Quantity: {sum(products.values())}")