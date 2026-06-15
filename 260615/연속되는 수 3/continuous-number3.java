import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        int cnt = 1;
        int res = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            if (i == 0) {
                flag = k > 0 ? true : false;
                continue;
            }

            if ((k > 0 && !flag) || (k < 0 && flag)) {
                res = Math.max(cnt, res);
                cnt = 0;
            }

            flag = k > 0 ? true : false;
            cnt++;
            res = Math.max(cnt, res);

        }

        System.out.println(res);


    }
}