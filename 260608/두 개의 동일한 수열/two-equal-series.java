import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        insertArr(st, arrA);

        st = new StringTokenizer(br.readLine());
        insertArr(st, arrB);

        if (isContained(arrA, arrB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    static void insertArr(StringTokenizer st, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }


    static boolean isContained(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) return false;
        }

        return true;
    }
}