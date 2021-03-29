import re

data = input()
pattern = r"\b(?P<day>\d{2})(?P<separator>[\./-])(?P<month>[A-Z][a-z]{2})(?P=separator)(?P<year>\d{4})\b"
dates = re.finditer(pattern, data)

for date in dates:
    d = date.groupdict()
    print(f"Day: {d['day']}, Month: {d['month']}, Year: {d['year']}")
# for date in dates:
#     m_obj = date.group(0)
#     day = m_obj[0:2]
#     month = m_obj[3:6]
#     year = m_obj[7:11]
#     print(f"Day: {day}, Month: {month}, Year: {year}")