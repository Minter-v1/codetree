import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < 0) {
                num = fn(num);
            }

            System.out.print(num + " ");
        }


    }

    static int fn(int a) {
        return Math.abs(a);
    }
}