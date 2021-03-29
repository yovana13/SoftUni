n = int(input())
sum = 0

for i in range(n):
    added_liters = int(input())
    if sum + added_liters < 255:
        sum += added_liters
    else:
        print("Insufficient capacity!")

print(sum)
