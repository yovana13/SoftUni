dict = {}
text = input().split()
print(text)

for key in range(1,len(text),2):
    text[key]=text[key].lower()
    if text[key] in dict:
        dict[text[key]] += int(text[key-1])
    else:
        dict[text[key]] = int(text[key-1])
key_dict = {}
if "shards" in dict:
    if dict["shards"]>250:
        dict["shards"] -=250
        print("Shards obtained!")
    key_dict["shards"] = dict["shards"]
if "fragments" in dict:
    if dict["fragments"]>250:
        dict["fragments"] -=250
        print("Fragments obtained!")
    key_dict["fragments"] = dict["fragments"]
if "motes" in dict:
    if dict["motes"]>250:
        dict["motes"] -=250
        print("Motes obtained!")
    key_dict["motes"] = dict["motes"]

key_dict1 = sorted(key_dict.items(), key=lambda x: x[1])
print(key_dict)
print(key_dict1)
print(dict)