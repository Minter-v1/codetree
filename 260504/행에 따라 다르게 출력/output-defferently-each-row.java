import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int num = 0;

        // 짝수번째 = 인덱스 홀수 -> 2씩증가
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r % 2 == 0) {
                    num++;
                } else {
                    num += 2;
                }
                matrix[r][c] = num;
            }
        }

        // 출력
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++ ) {
                System.out.print(matrix[r][c] + " ");
            }

            System.out.println();
        }

        
    }
}