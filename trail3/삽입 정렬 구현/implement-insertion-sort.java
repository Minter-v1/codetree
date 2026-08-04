import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 크기
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // 삽입할 숫자를 선택
            int j = i - 1; // 삽입할 수의 바로 왼쪽부터 비교해줌


            // 오른쪽으로 미뤄주는 과정임
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j]; // 1회차떈 현재 key 자리에 j위치 넣어준다.
                j--;
            }

            // 더이상 key가 움직이지 않는다.
            arr[j+1] = key;
        }



        // 출력부
        StringBuilder sb = new StringBuilder();

        for (int item: arr) {
            sb.append(item).append(' ');
        }

        System.out.println(sb);
        
    }
}