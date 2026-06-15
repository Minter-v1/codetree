import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        int cnt = 1;
        int res = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i-1]) {
                res = Math.max(cnt, res);
                cnt = 1;
                continue;
            }

            cnt++;
        }

        res = Math.max(res, cnt);
        System.out.println(res);

    }
}