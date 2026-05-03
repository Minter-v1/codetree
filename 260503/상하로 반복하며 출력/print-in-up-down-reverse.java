import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for(int col = 0; col < size; col++) {
            int n = (col % 2 == 0 ? 1 : size);
            boolean flag = (n == 1 ? true : false); // true면 증가
            
            for (int row = 0; row < size; row++) {
                matrix[row][col] = n;
                
                if (flag) {
                    n++;
                } else {
                    n--;
                }
            }
        }

        // 출력부
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(matrix[r][c]);
            }

            System.out.println();
        }
    }
}