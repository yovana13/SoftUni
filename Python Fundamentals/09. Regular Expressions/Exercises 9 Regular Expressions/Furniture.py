import re
line = input()
pattern = r"\B>>(?P<item>\w+)<<(?P<price>\d+(\.\d+)?)\!(?P<quantity>\d+)\b"
sum = 0
list_items=[]

while not line=="Purchase":
    match = re.match(pattern, line)
    if match:
        item = match.groupdict()["item"]
        price = float(match.groupdict()["price"])
        quantity = int(match.groupdict()["quantity"])
        list_items.append(item)
        sum = sum + quantity*price
    line = input()

print("Bought furniture:")
print(*list_items,sep="\n")
print(f"Total money spend: {sum}")