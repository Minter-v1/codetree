n = int(input())

# 2차원 배열 초기화
matrix = [[0 for _ in range(n)] for _ in range(n)]

# 일단 첫번째 열(인덱스 0)은 무조건 1
for row in range(0,n):
    matrix[row][0] = 1
    matrix[row][row] = 1


    
    



# 값을 바꿔줘야한다. -> 각 행의 2번째열(= 인덱스 1)부터
for row in range(1,n):
    for col in range(1,row):
        matrix[row][col] = matrix[row-1][col-1] + matrix[row-1][col]




# 출력부 -> 0이면 출력하지 않는다.
for row in matrix:
    for item in row:
        if item != 0:
            print(item, end=" ")
        else:
            continue
    print()
            