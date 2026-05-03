import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];
        

        for (int r = 0; r < size; r++) {
            int start;
            boolean flag = (r % 2 == 0 ? true : false); // true면 증가
            if (flag) {
                start = size * (r+1) - (size-1);
            } else {
                start = (r+1) * size;
            }

            for (int c = 0; c < size; c++) {
                matrix[r][c] = start;
                if (flag) {
                    start++;
                } else {
                    start--;
                }
            }
        }

        // 출력
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(matrix[r][c] + " ");
            }

            System.out.println(" ");
        }
    }
}