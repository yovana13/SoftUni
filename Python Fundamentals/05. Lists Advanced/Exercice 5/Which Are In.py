substring = input().split(", ")
string = input().split(", ")
result = []

for i in substring:
    for j in string:
        if i in j:
            result.append(i)
#result = list(sorted(set(result), key = result.index())))
#result.reverse()
print(sorted(set(result), key = result.index))