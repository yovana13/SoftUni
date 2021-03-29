import math
budget = float(input())
students = int(input())
flourPrice = float(input())
eggPrice = float(input())
apronPrice = float(input())

sum = apronPrice * (students + math.ceil(students*0.2)) + eggPrice*10*students + flourPrice*(students - students//5)

if sum<=budget:
    print(f"Items purchased for {sum:.2f}$.")
else:
    print(f"{sum - budget:.2f}$ more needed.")