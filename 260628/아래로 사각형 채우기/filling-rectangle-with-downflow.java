import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int r = 1; r <= n; r++) {
            for (int c = r; c <= r + n*(n-1); c += n) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}