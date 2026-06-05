import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fn(n));
    }

    static int fn(int n) {
        // 홀수인 경우
        if (n % 2 != 0) {
            if (n == 1) return n;
            return n + fn(n-2);
        } else {
            if (n == 2) return n;
            return n + fn(n-2);
        }
    }
}