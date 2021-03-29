import re
data = input()
the_word = input()

pattern = f"\\b{the_word}\\b"
result = re.findall(pattern, data, re.IGNORECASE)

print(len(result))