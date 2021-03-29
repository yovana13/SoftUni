num = int(input())

def output(num):
    print(f"{num}%",end=" ")
    if num!=100:
        print("[",end="")
        for i in range (num//10):
            print("%",end="")
        for i in range(10 - num//10):
            print(".", end="")
        print("]\nStill loading...")
    else:
        print("Complete!")
        print("[", end="")
        for i in range(num // 10):
            print("%", end="")
        print("]")

output(num)