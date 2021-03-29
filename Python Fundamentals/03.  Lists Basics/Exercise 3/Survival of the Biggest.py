list_numbers =[int(el) for el in input().split()]
numbers_to_remove = int(input())

for i in range(numbers_to_remove):
    min = list_numbers[0]
    for j in range(1,len(list_numbers)):
        #print(list_numbers[j])
        if list_numbers[j] < min:
            min = list_numbers[j]
    list_numbers.remove(min)

print(list_numbers)

