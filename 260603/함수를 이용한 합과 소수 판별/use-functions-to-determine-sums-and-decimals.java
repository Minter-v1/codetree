import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(fn(a, b));
        
    }

    
    static int fn(int a, int b) {
        int cnt = 0;

        // 소수 판별
        for (int i = a; i <= b; i++) {
            if (!decimal(i)) continue;

            int sum = sum(i);
            if (sum % 2 == 0) cnt++;
        }

        return cnt;

    }

    // 자릿수 합
    static int sum(int n) {
        int res = 0;

        for (int i = 2; i >= 0; i--) {
            res += n / (int) Math.pow(10, i);
            n = n % (int) Math.pow(10, i);
        }

        return res;
    }

    // 소수 판별기
    static boolean decimal(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}