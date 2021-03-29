given_string = input()
n = int(input())

def repeat_string(n, given_string):
    result = ""
    for i in range(n):
        result += given_string
    return  result

print(repeat_string(n ,given_string))