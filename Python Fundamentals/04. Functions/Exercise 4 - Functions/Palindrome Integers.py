list_numbers = [int(el) for el in input().split(", ")]

for index in range(len(list_numbers)):
    new_number = 0
    old_number = list_numbers[index]
    while old_number>0:
        new_number = new_number*10 + old_number%10
        old_number = old_number//10
    if new_number == list_numbers[index]:
        print("True")
    else:
        print("False")
