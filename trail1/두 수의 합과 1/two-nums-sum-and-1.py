import sys

input = sys.stdin.readline

total = sum(map(int, input().split()))

print(str(total).count('1'))


