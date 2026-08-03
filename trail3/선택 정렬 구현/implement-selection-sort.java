import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n-1; i++) {
            int min = i;

            // 더 작은 수의 인덱스 찾기
            for(int j = i+1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j ; //인덱스 스위칭
                }
            }

            // arr[i], arr[j] 값을 스위칭한다.
                int tmp = arr[i];

                arr[i] = arr[min]; // 지금은 min 값이 j로 스위칭 된 상황
                arr[min] = tmp;
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num).append(' ');
        }

        System.out.println(sb);

        
    }
}