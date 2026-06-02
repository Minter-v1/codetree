import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = fn(a, b);

        System.out.println(arr[0] + " " + arr[1]);



    }

    static int[] fn(int a, int b) {
        if (a > b) {
            a *= 2;
            b += 10;
        } else {
            a += 10;
            b *= 2;
        }

        return new int[] {a, b};
    }
}