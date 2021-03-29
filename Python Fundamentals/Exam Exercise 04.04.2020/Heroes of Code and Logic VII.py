n = int(input())
HP={}
MP = {}

for i in range(n):
    hero = input()
    HP[hero.split()[0]] = int(hero.split()[1])
    MP[hero.split()[0]] = int(hero.split()[2])

data = input()
while data!="End":
    command = data.split(" - ")[0]
    hero_name = data.split(" - ")[1]
    if command=="CastSpell":
        MP_needed = int(data.split(" - ")[2])
        spell_name = data.split(" - ")[3]
        if MP[hero_name]>MP_needed:
            MP[hero_name] -= MP_needed
            print(f"{hero_name} has successfully cast {spell_name} and now has {MP[hero_name]} MP!")
        else:
            print(f"{hero_name} does not have enough MP to cast {spell_name}!")
    elif command=="TakeDamage":
        HP_needed = int(data.split(" - ")[2])
        attacker = data.split(" - ")[3]
        if HP[hero_name]>HP_needed:
            HP[hero_name] -= HP_needed
            print(f"{hero_name} was hit for {HP_needed} HP by {attacker} and now has {HP[hero_name]} HP left!")
        else:
            print(f"{hero_name} has been killed by {attacker}!")
            MP.pop(hero_name)
            HP.pop(hero_name)
    elif command == "Recharge":
        amount = int(data.split(" - ")[2])
        MP[hero_name] += amount
        amount_recovered = amount
        if MP[hero_name]>200:
            amount_recovered = amount - (MP[hero_name] - 200)
            MP[hero_name]=200
        print(f"{hero_name} recharged for {amount_recovered} MP!")
    elif command=="Heal":
        amount = int(data.split(" - ")[2])
        HP[hero_name] += amount
        amount_recovered = amount
        if HP[hero_name] > 100:
            amount_recovered = amount - (HP[hero_name] - 100)
            HP[hero_name] = 100
        print(f"{hero_name} healed for {amount_recovered} HP!")
    data=input()

sortedHP= dict(sorted(HP.items(), key=lambda x:(-x[1], x[0])))
for h_name in sortedHP:
    print(f"{h_name}")
    print(f"  HP: {HP[h_name]}")
    print(f"  MP: {MP[h_name]}")
