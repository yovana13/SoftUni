char1 = input()
char2 = input()

num1= ord(char1)
num2 = ord(char2)

for i in range(num1+1,num2):
    print(f"{chr(i)}", end=" ")