electrons = int(input())
electron_list =[]
cell_number=1

while electrons>0:
    possible_electrones = 2 * (cell_number**2)
    if possible_electrones>electrons:
        electron_list.append(electrons)
    else:
        electron_list.append(possible_electrones)
    electrons-=possible_electrones
    cell_number+=1

print(electron_list)


