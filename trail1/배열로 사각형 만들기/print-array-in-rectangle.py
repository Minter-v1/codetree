# 배열 초기화
matrix = [[0 for _ in range(5)] for _ in range(5)]

# 1 값으로 초기화
for r in range(5):
    # 첫번째 열(인덱스 0)은 무조건 0으로 바꿔준다
    matrix[r][0] = 1

    if (r != 0): continue

    for c in range(5):
        matrix[r][c] = 1

for row in range(1,5):
    for col in range(1,5):
        # 한칸 위(인덱스 감소 row)와 왼쪽(인덱스 감소 col)을 더해서 현재 위치
        matrix[row][col] = matrix[row-1][col] + matrix[row][col-1]




# 출력부
for row in matrix:
    print(' '.join(map(str, row)))