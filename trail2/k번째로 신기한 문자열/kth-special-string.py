n, k, t = input().split()
n, k = int(n), int(k)
str = [input() for _ in range(n)]

# Please write your code here.
tmp = []

for w in str:
    if w.startswith(t):
        tmp.append(w)

tmp.sort()

print(tmp[k-1])