import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];

        

        for (int i = 0; i < arr.length; i++) {
            int tmp = Integer.parseInt(st.nextToken());


            if (tmp == 0) {
                int sum = arr[i-1] + arr[i-2] + arr[i-3];
                System.out.println(sum);
                break;
            }
            arr[i] = tmp;
        }

        


    }
}