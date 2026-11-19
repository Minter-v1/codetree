n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# Please write your code here.

set_A = set(A)
set_B = set(B)
flag = True

for item in A:
    if not item in B:
        flag = False
        break

ans = "Yes" if flag else "No"

print(ans)
