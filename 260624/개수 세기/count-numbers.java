import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == m) {
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}