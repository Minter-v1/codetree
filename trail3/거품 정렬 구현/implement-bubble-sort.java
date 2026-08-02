import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 원소의 수
        int n = Integer.parseInt(br.readLine());

        // 배열 선언
        int[] arr = new int[n];

        // 배열 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 값 채워주기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean swapped;
        int end = n-1;


        // 버블 정렬
        do {
            
            /**
             - 이미 정렬된 상태라면 swapped 덕분에 O(n)으로 끝남
             - for문을 1회 도는데 swapped이 변경되지 않을 테니)
             */
            swapped = false;

            for (int i = 0; i < end; i++) {
                // 앞 원소가 더 큰 값을 갖는 경우
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    
                    swapped = true;
                }
            }

            // end도 줄여주면서 반복 돌아야하는 구간을 줄여줌
            end--;
        } while (swapped);

        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
}