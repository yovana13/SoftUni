import re
pattern = r"(?P<symbol>#|\|)(?P<name>[a-zA-Z\s]+)(?P=symbol)(?P<date>\d{2}/\d{2}/\d{2})(?P=symbol)(?P<calories>\d+)(?P=symbol)"
data = input()

sum_cal = 0
items = re.finditer(pattern, data)

for i in items:
    cc = i.groupdict()["calories"]
    sum_cal += int(cc)

print(f"You have food to last you for: {sum_cal//2000} days!")

items = re.finditer(pattern, data)
for nn in items:
    print(f"Item: {nn.groupdict()['name']}, Best before: {nn.groupdict()['date']}, Nutrition: {nn.groupdict()['calories']}")