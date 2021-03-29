todo = input()
notes = [0] * 10

while todo!="End":
    priority = int(todo.split("-")[0])
    note = todo.split("-")[1]
    notes.insert(priority, note)
    todo = input()

result = []
for el in notes:
    if el != 0:
        result.append(el)
print(result)