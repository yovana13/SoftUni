products_prices = {}
products_quantities = {}

data = input()

while data!="buy":
    product, price, quantity = data.split()
    price = float(price)
    quantity = int(quantity)

    if product not in products_prices:
        products_prices[product] = price
        products_quantities[product] = quantity
    else:
        products_prices[product] = price
        products_quantities[product] += quantity
    data = input()

for product in products_prices:
    print(f"{product} -> {products_prices[product]*products_quantities[product]:0.2f}")