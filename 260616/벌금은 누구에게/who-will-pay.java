import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int res = -1;

        int[] arr = new int[n+1];
        int[] order = new int[n+1];
        int tmp = 1;

        for (int i = 0; i < m; i++) {
            int student = Integer.parseInt(br.readLine());
            arr[student]++;

            if (arr[student] == k) {
                order[student] = tmp;
                tmp++;
            }
        }

        boolean flag = false;

        for (int i = 1; i < n+1; i++) {
            if (order[i] == 1) {
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }

        

    }
}