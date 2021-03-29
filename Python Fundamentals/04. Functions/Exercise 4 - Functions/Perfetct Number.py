num = int(input())
sum = 0

for i in range(1,num):
    if num% i == 0:
        sum += i

if sum == num:
    print("We have a perfect number!")
else:
    print("It's not so perfect.")