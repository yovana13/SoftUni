number = int(input())

years = number * 100
days = years * 365.2422
days = int(days)
hours = days * 24
minutes = hours * 60

print(f'{number} centuries = {years} years = {days} days = {hours} hours = {minutes} minutes')