import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Integer[] arr = fn(n, m);


        System.out.println(arr[0] + " " + arr[1]);

        




    }

    static Integer[] fn(int a, int b) {
        if (a > b) {
            a += 25;
            b *= 2;
        } else {
            a *= 2;
            b += 25;
        }

        

        return new Integer[] {a, b};
    }
}