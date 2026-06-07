import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fn(n, 0));
    }

    static int fn(int a, int cnt) {
        if (a <= 1) {
            return cnt;
        }

        if (a % 2 == 0) {
            return fn(a/2, cnt+1);
        } else {
            return fn(a*3+1, cnt+1);
        }

    }
}