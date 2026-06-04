import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 라인 또 읽기
        st = new StringTokenizer(br.readLine());

        arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            System.out.println(intervalSum(s, e));
        }

    }

    static int intervalSum(int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += arr[i];
        }

        return sum;
    }
}