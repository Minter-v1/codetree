import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];
        int ans = 0;

         for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            if (i == 0) {
                ans = (x2 - x1) * (y2 - y1);
            }

            x1 += 1000;
            y1 += 1000;
            x2 += 1000;
            y2 += 1000;

            for (int r = x1; r < x2; r++) {
                for (int c = y1; c < y2; c++) {
                    if (i == 1) {
                        arr[r][c] = 0;
                    } else {
                        arr[r][c] = 1;
                    }
                }
            }
            
        }

        int minX = 2001, minY = 2001;
        int maxX = -1, maxY = -1;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[r][c] != 1) continue;
                minX = Math.min(minX, r);
                minY = Math.min(minY, c);
                maxX = Math.max(maxX, r);
                maxY = Math.max(maxY, c);
            }
        }
        if (maxX == -1) {
            System.out.println(0);
        } else {
            ans = (maxX - minX + 1) * (maxY - minY + 1); 
            System.out.println(ans);
        }
        
        
    }

   
}