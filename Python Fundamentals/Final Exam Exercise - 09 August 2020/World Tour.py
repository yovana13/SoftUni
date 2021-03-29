stops = input()
data = input()

while data!="Travel":
    command = data.split(":")[0]
    if command=="Add Stop":
        index=int(data.split(":")[1])
        if -1<index<len(stops):
            new_stops=stops[0:index]+data.split(":")[2]+stops[index:]
            print(new_stops)
            stops= new_stops
    elif command=="Remove Stop":
        index_start = int(data.split(":")[1])
        index_end = int(data.split(":")[2])
        if -1<index_end<len(stops) and -1<index_start<len(stops):
            new_stops = stops[0:index_start] + stops[index_end+1:]
            print(new_stops)
            stops=new_stops
    elif command=="Switch":
        old_str = data.split(":")[1]
        new_str = data.split(":")[2]
        if old_str in stops:
            new_stops = stops.replace(old_str,new_str)
            print(new_stops)
            stops=new_stops
    data = input()

print(f"Ready for world tour! Planned stops: {stops}")