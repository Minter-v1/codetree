import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 소의 수
        int n = Integer.parseInt(br.readLine());

        // 소 배열
        int[] cows = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (cows[i] <= cows[j]  && cows[j] <= cows[k]) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}