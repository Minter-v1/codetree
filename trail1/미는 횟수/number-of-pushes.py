import sys

input = sys.stdin.readline

src = input().strip()
target = input().strip()

# 일단 src를 리스트로 만들어버림
lst_src = list(src)
cnt = 0

while ("".join(lst_src) != target):

    if cnt >= len(lst_src):
        cnt = -1
        break

    # tail 값 임시 저장
    tmp = lst_src[len(lst_src) - 1]

    # 오른쪽으로 먼저 이동시켜보자 (마지막 idx - 1 까지 대상임)
    for i in range(len(lst_src) - 1, 0, -1):
        lst_src[i] = lst_src[i-1]

    # head값을 바꿔주지
    lst_src[0] = tmp

    # 회전 횟수 갱신
    cnt += 1
    


print(cnt)
