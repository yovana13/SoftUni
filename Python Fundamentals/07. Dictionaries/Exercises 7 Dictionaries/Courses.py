data = input()
courses_dict ={}

while data!="end":
    courseName = data.split(" : ")[0]
    studentName = data.split(" : ")[1]
    if courseName not in courses_dict:
        courses_dict[courseName] = []
    courses_dict[courseName].append(studentName)

    data = input()

# course_number_members = {}
# for key in courses_dict:
#     course_number_members[key] = len(courses_dict[key])
#
# course_number_members = dict(sorted(course_number_members.items(), key=lambda x:-x[1]))
courses_dict = dict(sorted(courses_dict.items(), key=lambda x:(-len(x[1]))))
for key in courses_dict:
    print(f"{key}: {len(courses_dict[key])}")
    courses_dict[key].sort()
    for i in range(len(courses_dict[key])):
        print(f"-- {courses_dict[key][i]}")