words = input().split()
occurences = {}

words = [w.lower() for w in words]

for word1 in words:
    occurences[word1] = words.count(word1)

# print(occurences)

for key, value in occurences.items():
    if not value%2==0:
        print(f"{key}",end=' ')