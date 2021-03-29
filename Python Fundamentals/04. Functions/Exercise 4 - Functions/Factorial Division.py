num1 = int(input())
num2 = int(input())

def caluclate_factorial(num):
    factorial =1
    for i in range(1, num+1):
        factorial = factorial * i
    return factorial

print(f"{caluclate_factorial(num1)/caluclate_factorial(num2):.2f}")