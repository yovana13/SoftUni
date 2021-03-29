number=int(input())
even_list=[]
odd_list=[]
negative_list=[]
positive_list=[]

for n in range (number):
    new_number=int(input())
    if(new_number>=0):
        positive_list.append(new_number)
    if new_number<0:
        negative_list.append(new_number)
    if new_number%2==0:
        even_list.append(new_number)
    if new_number%2!=0:
        odd_list.append(new_number)

category=input()

if category=="odd":
    print(odd_list)
elif category=="negative":
    print(negative_list)
elif category == "positive":
    print(positive_list)
elif category == "even":
    print(even_list)