red_cards = input().split(" ")
teamA = 11
teamB = 11
counterA=0
counterB=0
h=1

for i in range(0, len(red_cards),1):
    for j in range(1,len(red_cards),1):
        if not i==j:
            if(red_cards[i]==red_cards[j]):
                if "A" in red_cards[i]:
                    counterA+=1
                else:
                    counterB +=1
counterB = counterB//2
counterA = counterA//2
for k in range(0,len(red_cards)):
    if "A" in red_cards[k]:
        teamA -=1
    else:
        teamB -=1

print(f"Team A - {teamA+counterA}; Team B - {teamB+counterB}")
if teamA<7 or teamB<7:
    print("Game was terminated")