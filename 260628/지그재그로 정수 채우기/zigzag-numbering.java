import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr2d = new int[n][m];

        int num = 0;

        //열을 더 크게 돌자
        for (int c = 0 ; c < m; c++) {
            // 이제 행을 돌자
            if (c % 2 == 0) {
                for (int r = 0; r < n; r++) {
                    arr2d[r][c] = num++;
                }
            } else {
                for (int r = n-1; r >=0; r--) {
                    arr2d[r][c] = num++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        // 출력부
        for (int[] arr : arr2d) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]);

                if (i != m-1) {
                    sb.append(" ");
                }
                
            }
            sb.append("\n");
        }

        System.out.println(sb);


        
    }
}