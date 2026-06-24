import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num % 3 == 0) {
                System.out.println(arr[i-1]);
                break;
            }

            arr[i] = num;
        }

    }
}