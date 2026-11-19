n = int(input())
name = []
height = []
weight = []

for _ in range(n):
    n_i, h_i, w_i = input().split()
    name.append(n_i)
    height.append(int(h_i))
    weight.append(int(w_i))

# Please write your code here.
people = [
    (name[i],height[i],weight[i])
    for i in range(n)
]

people.sort(lambda x: x[1])

for p in people:
    print(p[0],p[1],p[2])