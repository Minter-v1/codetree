import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int oddSum = 0;
        int evenSum = 0;

        int max, min;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                oddSum += Integer.parseInt(st.nextToken());
            } else {
                evenSum += Integer.parseInt(st.nextToken());
            }
        }

        if (oddSum > evenSum) {
            max = oddSum;
            min = evenSum;
        } else {
            max = evenSum;
            min = oddSum;
        }

        System.out.println(max-min);
    }
}