import sys

input = sys.stdin.readline

n, string = input().split()
n = int(n)
cnt = 0

for _ in range(n):
    string2 = input().strip()

    if string2 != string:
        continue
    else:
        cnt += 1

print(cnt)