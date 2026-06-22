import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (cnt == 3 || cnt == 5 || cnt == 10) {
                sum += tmp;
            }

            cnt++;
        }

        System.out.println(sum);
    }
}