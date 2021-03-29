operation = input()
first_num = int(input())
second_num = int(input())

def solve(first_num,second_num,operation):
    result = None
    if operation == "subtract":
        result = first_num - second_num
    elif operation == "divide":
        result = first_num/second_num
    elif operation == "multiply":
        result = first_num*second_num
    elif operation == "add":
        result = first_num + second_num
    return  result

print(f"{solve(first_num,second_num, operation):.0f}")


