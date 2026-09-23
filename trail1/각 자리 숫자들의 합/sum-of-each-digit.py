import sys

input = sys.stdin.readline

num = input().strip()
sum = 0


for digit in num:
    sum += int(digit)

print(sum)
