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

            x1 += 100;
            y1 += 100;

            for (int r = x1; r < x1 + 8; r++) {
                for (int c = y1; c < y1 + 8; c++) {
                    arr[r][c]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) continue;
                area++;
            }
        }

        System.out.println(area);


        
    }
}