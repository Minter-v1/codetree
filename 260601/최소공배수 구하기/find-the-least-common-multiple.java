import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(lcm(n, m));


    }

    static int lcm(int a, int b) {
        return (a*b) / gcd(a, b);
    }


    static int gcd(int a, int b) {
        if (b != 0) {
            return gcd(b, a%b);
        }
        return a;
    }
}