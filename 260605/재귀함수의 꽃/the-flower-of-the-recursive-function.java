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
            System.out.print(1 + " ");
            System.out.print(1 + " ");
            return;
        }

        System.out.print(n + " ");
        fn(n-1);
        System.out.print(n + " ");
        

        return;
    }
}