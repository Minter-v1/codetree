import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];
        int area = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // 음수인 경우
            if (x1 < 0) {
                x1 += 100;
                x2 += 100;
            } 

            if (y1 < 0) {
                y1 += 100;
                y2 += 100;
            } 

            for (int r = x1; r < x2; r++) {
                for (int col = y1; col < y2; col++) {
                    if (arr[r][col] != 0) continue;
                    arr[r][col] = 1;
                }
            }
        }


        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] != 1) continue;
                area++;
            }
        }

        System.out.println(area);






    }
}