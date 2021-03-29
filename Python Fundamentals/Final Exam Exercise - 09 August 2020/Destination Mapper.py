import re
data = input()
patter = r"(?P<separator>=|/)(?P<destination>[a-zA-Z]{3,})(?P=separator)"
places = re.findall(patter,data)
print(places)
list=[]
sum_all = 0
for i in range(len(places)):
    list.append(places[i][1])
    sum_all += len(places[i][1])

print(f"Destinations: {', '.join(list)}")
print(f"Travel Points: {sum_all}")


