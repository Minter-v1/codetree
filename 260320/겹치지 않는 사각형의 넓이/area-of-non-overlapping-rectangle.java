import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];
        int ans = 0;

        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += 1000;
            x2 += 1000;
            y1 += 1000;
            y2 += 1000;


            for (int row = x1; row < x2; row++) {
                for (int col = y1; col < y2; col++) {
                    if (i == 2) {
                        arr[row][col] = 3;
                        continue;
                    }
                    arr[row][col]++;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr[i][j] == 0) || (arr[i][j] == 3)) continue;
                ans++;
            }
        }

        System.out.println(ans);
    }
}