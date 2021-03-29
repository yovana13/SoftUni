input1 = input()
sum_prices = 0

while input1!="special" and input1!="regular":
    float_input = float(input1)
    if float_input > 0:
        sum_prices += float_input
    else:
        print("Invalid price!")

    input1 = input()

price_with_taxes = sum_prices + sum_prices*0.2
if input1 == "special":
    price_with_taxes = price_with_taxes - price_with_taxes * 0.1
if price_with_taxes > 0:
    print("Congratulations you've just bought a new computer!")
    print(f"Price without taxes: {sum_prices:.2f}$")
    print(f"Taxes: {sum_prices*0.2:.2f}$")
    print("-----------")
    print(f"Total price: {price_with_taxes:.2f}$")
else:
    print("Invalid order!")

