items_with_prices = input().split("|")
budget = float(input())
beginning_budget = budget
money_at_the_end = 0

for index in range(len(items_with_prices)):
    x = False
    type_product = items_with_prices[index].split("->")[0]
    price_product = float(items_with_prices[index].split("->")[1])
    if type_product == "Clothes" and 0<price_product<50.0:
        x = True
    elif type_product == "Shoes" and 0<price_product<35.0:
        x = True
    elif type_product == "Accessories" and 0<price_product<20.50:
        x = True
    if x:
        if budget - price_product >= 0:
            budget -= price_product
            price_product = price_product+(price_product * 40 / 100)
            money_at_the_end += price_product
            print(f"{price_product:.2f}", end=' ')


money_at_the_end += budget
print()
print(f"Profit: {money_at_the_end-beginning_budget:.2f}")
if money_at_the_end >= 150:
    print("Hello, France!")
else:
    print("Time to go.")