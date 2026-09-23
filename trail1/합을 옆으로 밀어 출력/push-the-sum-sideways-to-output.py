import sys

input = sys.stdin.readline

# 총 입력 횟수 
n = int(input().strip())

# 숫자 총합 변수 초기화
total = 0

for _ in range(n):
    total += int(input().strip())

# 문자열 변수 초기화
ans = ''
tmp = None

for idx, digit in enumerate(str(total)):
    # 첫번째 아닌 경우
    if (idx != 0):
        ans += digit
    
    # 첫번째인 경우
    else:
        tmp = digit

print(ans+tmp)


