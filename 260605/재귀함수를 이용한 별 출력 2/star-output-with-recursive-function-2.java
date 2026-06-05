import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fn(n);



    }

    static void fn(int n) {
        if (n == 1) {
            System.out.println("*");
            System.out.println("*");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();

        fn(n-1);

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}