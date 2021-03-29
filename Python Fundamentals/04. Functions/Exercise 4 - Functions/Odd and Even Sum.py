num = input()
sum_odd = 0
sum_even = 0

for i in range(len(num)):
    n = int(num[i])
    if n%2 == 0:
        sum_even += n
    else:
        sum_odd += n

print(f"Odd sum = {sum_odd}, Even sum = {sum_even}")