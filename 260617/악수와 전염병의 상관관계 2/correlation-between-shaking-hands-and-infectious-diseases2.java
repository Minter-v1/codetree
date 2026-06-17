import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 총 개발자 수
        int K = Integer.parseInt(st.nextToken()); // 전파 가능 수
        int P = Integer.parseInt(st.nextToken()); // 첫 감염자 id
        int T = Integer.parseInt(st.nextToken()); // 입력 받는 횟수

        // 감염 여부 파악 배열
        boolean[] infected = new boolean[N+1];
        
        // 전파 가능 수 파악 배열
        int[] remain = new int[N+1];

        // 악수 정보 파악 배열
        int[][] shake = new int[T][3];

        infected[P] = true;
        remain[P] = K;





        

        // 악수 정보 입력 받기 시작
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            shake[i][0] = Integer.parseInt(st.nextToken()); // 악수하는 시각
            shake[i][1] = Integer.parseInt(st.nextToken()); // 개발자 1
            shake[i][2] = Integer.parseInt(st.nextToken()); // 개발자 2
        }

        Arrays.sort(shake, (a,b) -> a[0] - b[0]);

        for (int i = 0; i < T; i++) {
            int x = shake[i][1];
            int y = shake[i][2];

            boolean canX = infected[x] && remain[x] > 0; // 감염된적 있고 전파가능 수 남아있으면 true
            boolean canY = infected[y] && remain[y] > 0;

            if (canX && !infected[y]) { // x->y 감염
                infected[y] = true;
                remain[y] = K;
            }

            if (canY && !infected[x]) { //y가 x 감염
                infected[x] = true;
                remain[x] = K;
            }

            if (canX) remain[x]--;
            if (canY) remain[y]--;


        
        }   

        StringBuilder sb = new StringBuilder();
        

        for (int i = 1; i < N+1; i++) {
            sb.append(infected[i] ? 1 : 0);
        }

        System.out.println(sb);


    }



    
}

