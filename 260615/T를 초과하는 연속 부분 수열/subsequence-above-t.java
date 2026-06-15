import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int threshold = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0, res = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] <= threshold) {
                cnt = 0;
                continue;
            } else {
                cnt++;
            }
            
            res = Math.max(res, cnt);

            
        }

        System.out.println(res);

    }
}