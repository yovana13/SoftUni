command = input()
price = 0

while not (command == "special" or command == "regular"):
    current_price = float(command)
    if current_price <=0:
        print("Invalid price!")
    else:
        price+= current_price
    command = input()

if price == 0:
    print("Invalid order!")
else:
    print("Congratulations you've just bought a new computer!")
    print(f"Price without taxes: {sum_prices:.2f}$")
    print(f"Taxes: {sum_prices * 0.2:.2f}$")
    print("-----------")
    print(f"Total price: {price_with_taxes:.2f}$")