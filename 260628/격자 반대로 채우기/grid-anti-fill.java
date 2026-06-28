import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr2d = new int[n][n];

        int num = 1;
        boolean flag = false;

    
        for (int c = n-1; c >= 0; c--) {
            // 역방향 (아래 -> 위) 
            if (!flag) {
                for (int r = n-1; r >= 0; r--) {
                    arr2d[r][c] = num++;
                    flag = true;
                }
            } else {
                // 순방향 (아래)
                for (int r = 0; r < n; r++) {
                    arr2d[r][c] = num++;
                    flag = false;
                }

            }
        }

        for (int[] arr: arr2d) {
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]);

                if (i != (n-1)) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}