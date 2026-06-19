import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] row = new int[n];

            for (int j = 0; j < n; j++) {
                row[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < n-2; j++) {
                int tmp = row[j] + row[j+1] + row[j+2];

                if (max < tmp) {
                    max = tmp;
                }
            }
        }


        System.out.println(max);
    }
}