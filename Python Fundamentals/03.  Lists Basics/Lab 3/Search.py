number = int(input())
word = input()
list=[]
list_with_word = []

for i in range(1,number+1):
    new_sentence = input()
    list.append(new_sentence)
    if word in new_sentence:
        list_with_word.append(new_sentence)

print(list)
print(list_with_word)