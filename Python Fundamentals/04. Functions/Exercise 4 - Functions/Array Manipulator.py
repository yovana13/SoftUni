list = [int(el) for el in input().split()]
command = input()


def func(command, list):
    n = 1
    new_list = []
    if command.split()[1] == "even":
        for i in range(len(list)):
            if list[i] % 2 == 0 and n < 2:
                n += 1
                new_list.append()
    elif command.split()[1] == "odd":
        for i in range(len(list)):
            if list[i] % 2 != 0 and n < 2:
                n += 1
                new_list.append()
    print(list)


while command != "end":
    type = command.split()[0]

    if type == "exchange":
        index = int(command.split()[1])
        if 0<index<len(list):
            list = list[index + 1:] + list[:index + 1]
        else:
            print(f'Invalid index')
    elif type == "max":
        if command.split()[1] == "even":
            for i in range(len(list)):
                if list[i]%2==0:
                    max = list[i]
                    index_max = i
                    break
            for i in range(len(list)):
                if list[i] % 2 == 0 and list[i]>max:
                    max = [i]
                    index_max = i
        elif command.split()[1] == "odd":
            for i in range(len(list)):
                if list[i]%2!=0:
                    max = list[i]
                    index_max = i
                    break
            for i in range(len(list)):
                if list[i] % 2 != 0 and list[i]>max:
                    max = [i]
                    index_max = i
        print(index_max)
    elif type == "min":
        if command.split()[1] == "even":
            for i in range(len(list)):
                if list[i]%2==0:
                    min = list[i]
                    index_min = i
                    break
            for i in range(len(list)):
                if list[i] % 2 == 0 and list[i]<min:
                    min = list[i]
                    index_min = i
        elif command.split()[1] == "odd":
            for i in range(len(list)):
                if list[i]%2!=0:
                    min = list[i]
                    index_min = i
                    break
            for i in range(len(list)):
                if list[i] % 2 != 0 and list[i]>min:
                    min = list[i]
                    index_min = i
        print(index_min)
    elif type == "first":
        func(command, list)
    elif type == "last":
        reverse_list = list.reverse()
        func(command, reverse_list)
    command = input()

print(list)
