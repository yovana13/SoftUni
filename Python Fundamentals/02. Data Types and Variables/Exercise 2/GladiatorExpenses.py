lost_games= int(input())
price_helmet= float(input())
price_sword= float(input())
price_shield= float(input())
price_armor= float(input())

sum_for_repair=0

sum_for_repair = (int(lost_games/2))*price_helmet + (int(lost_games/3))*price_sword + (int(lost_games/6))*price_shield + (int(lost_games/12))*price_armor
print(f"Gladiator expenses: {sum_for_repair:.2f} aureus")