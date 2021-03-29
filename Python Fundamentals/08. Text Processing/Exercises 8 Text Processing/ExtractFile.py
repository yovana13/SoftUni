path = input()
path_list = path.split("\\")
file_name = path_list[len(path_list)-1].split(".")[0]
extension = path_list[len(path_list)-1].split(".")[1]

print(f"File name: {file_name}")
print(f"File extension: {extension}")