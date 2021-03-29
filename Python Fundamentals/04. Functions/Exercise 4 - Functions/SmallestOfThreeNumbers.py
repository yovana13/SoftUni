num1 = int(input())
num2 = int(input())
num3 = int(input())

def smalest_num(num1, num2, num3):
    if num1< num2 and num1 < num3:
        return num1
    if num2 < num3 and num2 < num1:
        return num2
    if num3 < num2 and num3 < num1:
        return num3

print(smalest_num(num1, num2, num3))