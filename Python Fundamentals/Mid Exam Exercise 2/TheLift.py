number_peopel = int(input())
lift = [int(el) for el in input().split()]
MAX_SEATS_PER_LIFT = 4

for index in range(len(lift)):
    while lift[index]!=MAX_SEATS_PER_LIFT:
        if number_peopel > 0:
            lift[index] +=1
            number_peopel -=1
        elif number_peopel==0:
            break

if number_peopel==0 and sum(lift)/len(lift)!=4:
    print("The lift has empty spots!")
elif number_peopel!=0:
    print(f"There isn't enough space! {number_peopel} people in a queue!")
print(' '.join([str(el) for el in lift]))


