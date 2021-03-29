order = input()
number_orders = int(input())

def total_price(order, number_orders):
    result = 0
    if order == "coffee":
        result = result + number_orders *1.50
    elif order == "water":
        result = result + number_orders *1.00
    elif order == "coke":
        result = result + number_orders *1.40
    elif order == "snacks":
        result = result + number_orders * 2.00
    return result

print(f"{total_price(order, number_orders):.2f}")