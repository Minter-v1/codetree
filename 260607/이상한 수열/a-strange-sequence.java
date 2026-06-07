import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fn(n));
    }

    static int fn(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fn(n/3) + fn(n-1);
    }
}