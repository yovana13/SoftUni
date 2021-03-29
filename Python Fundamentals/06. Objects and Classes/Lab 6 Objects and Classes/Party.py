class Party:
    def __init__(self):
        self.people=[]

party_object = Party()
line = input()
while line!="End":
    party_object.people.append(line)
    line=input()

print(f"Going: {', '.join(party_object.people)}")
print(f"Total: {len(party_object.people)}")