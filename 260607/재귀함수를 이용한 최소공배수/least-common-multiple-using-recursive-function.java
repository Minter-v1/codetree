import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(fn(n-1));

    }
    static int fn(int n) {
        if (n == 0) return arr[0];
        return lcm(fn(n-1),arr[n]);
    }

    static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}