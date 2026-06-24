import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 명령 처리
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());
            
            if (order == 1) {
                int a = Integer.parseInt(st.nextToken());
                System.out.println(arr[a-1]);

            } else if (order == 2) {
                int b = Integer.parseInt(st.nextToken());
                System.out.println(findValue(arr, b));

            } else {
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());

                printArr(arr, s, e);


            }
        }
    }

    static int findValue(int[] arr, int target) {
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                return i+1;
            }
        }

        return 0;
    }

    static void printArr(int[] arr, int s, int e) {
        for (int i = s-1; i < e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}