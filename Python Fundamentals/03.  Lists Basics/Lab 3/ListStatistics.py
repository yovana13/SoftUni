number_of_inputs = int(input())
positive=[]
negative=[]
sum_negative=0
number_positive=0

for n in range (1,number_of_inputs+1):
    num = int(input())
    if(num>=0):
        positive.append(num)
        number_positive+=1
    else:
        negative.append(num)
        sum_negative+=num

print(positive)
print(negative)
print(f"Count of positives: {number_positive}. Sum of negatives: {sum_negative}")
