def loading_bar(prt):
    prt_sign = num // 10
    return f"[{'%' * prt_sign}{'.' * (10 - prt_sign) }]"
    pass


num = int(input())
res = loading_bar(num)
if num == 100:
    print(f"100% Complete!")
    print(f"{res}")
else:
    print(f"{num}% {res}")
    print(f"Still loading...")