import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(fn(a, b));
        
        

    }

    static int fn(int a, int b) {
        int res = 1;

        for (int i = 0; i < b; i++) {
            res *= a;
        }

        return res;
    }
}