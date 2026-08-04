import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

    
        int[] arr = new int[n];

        // 배열 구성
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } 

        // 배열에서 가장 최댓값 찾아내기
        int max = Arrays.stream(arr).max().getAsInt();
        
        // 오름차순 기수 정렬
        /*
        * max / i(1,10,100,..) 
        ex. 802/1 = 1, 802/10 = 80, 802/100 = 8, 802/1000 = 0 이니까 1000의 자리는 정렬 안함
        */
        for (int i = 1; max / i > 0; i *= 10) {
            // 2차원 동적 배열(원소를 추가해야하니까 크기가 정해지지 않음)
            List<List<Integer>> buckets = new ArrayList<>();

            // 2차원 배열로 만들어 주기(0~9)
            for (int j = 0; j < 10; j++) {
                buckets.add(new ArrayList<>());
            }

            // 각 자릿수 기준으로 bucket에 넣기
            for (int item: arr) {
                /*
                * / :는 자릿수를 맨 오른쪽으로 이동시키는 역할
                * % 10 : 맨 오른쪾 숫자 하나만 떼어내는 역할 ex. 8'0' % 10 -> 0만 떼어올 수 있ㄷ음(나머지) 
                */
                int digit = (item / i) % 10; 
                buckets.get(digit).add(item); 
            }

            // 0~9 순서대로 실제 배열에 적용함
            int idx = 0;

            for (List<Integer> row: buckets) {
                for(int num: row) {
                    arr[idx] = num;
                    idx++;
                }
            }

            // 이제 위로 올라가서 자릿수를 왼쪽으로 이동시켜서 다시 정렬 반ㅂ고

        }


        // 충력부
        StringBuilder sb = new StringBuilder();

        for (int num: arr) {
            sb.append(num).append(' ');
        }

        System.out.println(sb);

    }
}