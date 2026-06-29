import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 격자 사이즈(홀수로만 주어짐)
        int N = Integer.parseInt(st.nextToken());

        // 명령의 수
        int T = Integer.parseInt(st.nextToken());

        // 2차원 배열
        int[][] table = new int[N][N];

        // 시작점 정의
        int x = N / 2, y = N / 2;
        int nx = 0, ny = 0;

        // 방향 정의
        int dirNum = 0; // 북쪽(N)시작

        // N -> E -> S -> W
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        
        // 명령 입력받기
        String order = br.readLine();

        // 배열 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                table[i][j] = num;
            }
        }

        int sum = table[y][x];

        // 명령 순회
        for (int i = 0; i < order.length(); i++) {
            // 명령 L
            if (order.charAt(i) == 'L') {
                dirNum = ((dirNum - 1) + 4) % 4;

            } else if (order.charAt(i) == 'R') {
                dirNum = (dirNum + 1) % 4;
                
            } else {
                // 명령 F
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];

                // 격자 범위 판단 
                // 유효하지 않은 위치면, x,y 좌표 갱신 하지 않음
                if (!isValid(table, nx, ny)) {
                    continue;
                } else {
                    x = nx;
                    y = ny;
                    sum += table[ny][nx];

                }
            }

            
            
        }

        // 답안 출력
        System.out.println(sum);
    }



    // 격자 범위 판단 메서드
    static boolean isValid(int[][] arr, int nx, int ny) {
        return (0 <= nx && nx < arr.length) && (0 <= ny && ny < arr.length);
        
    }
}