import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(fn(a,b));

    }


    static int fn (int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) continue;
            if (i % 10 == 5) continue;
            if ((i % 3 == 0) && (i % 9 != 0)) continue;

            cnt++;
        }
        return cnt;
    }
}