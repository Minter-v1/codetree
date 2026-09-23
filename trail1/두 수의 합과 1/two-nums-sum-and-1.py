import sys

input = sys.stdin.readline

# 입력된 정수 리스트
lst = map(int, input().split())
sum = sum(lst)

# 카운트 변수
cnt = 0

for char in str(sum):
    if char == '1':
        cnt += 1

print(cnt)
