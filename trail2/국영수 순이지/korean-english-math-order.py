n = int(input())
name = []
korean = []
english = []
math = []

for _ in range(n):
    student_info = input().split()
    name.append(student_info[0])
    korean.append(int(student_info[1]))
    english.append(int(student_info[2]))
    math.append(int(student_info[3]))

# Please write your code here.
students = [
    (name[i], korean[i], english[i], math[i])
    for i in range(n)
]

students.sort(lambda x: (-x[1], -x[2], -x[3]))

for s in students:
    print(s[0],s[1],s[2],s[3])

    