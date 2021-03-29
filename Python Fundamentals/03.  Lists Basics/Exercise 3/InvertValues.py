written_string = input()
list = written_string.split(" ")
list = [int(elem) for elem in list]
for el in range(len(list)-1):
    if list[el]>0 :
        list[el] = "-" + str(list[el])

print(written_string.split(" "))