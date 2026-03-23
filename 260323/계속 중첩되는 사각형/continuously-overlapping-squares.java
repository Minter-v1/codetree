import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[201][201];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += 100;
            x2 += 100;
            y1 += 100;
            y2 += 100;

            for (int r = x1; r < x2; r++) {
                for (int c = y1; c < y2; c++) {

                    if (i % 2 == 0) {
                        arr[r][c] = 1;
                    } else {
                        arr[r][c] = 2;
                    }
                    
                }
            }
        }
        int cnt = 0;

        for (int r = 0; r < 201; r++) {
            for (int c = 0; c < 201; c++) {
                if (arr[r][c] != 2) continue;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
