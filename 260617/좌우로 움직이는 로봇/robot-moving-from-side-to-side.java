import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 움직인 횟수
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 이동 정보를 담을 배열 생성
        Move[] movesA = new Move[n];
        Move[] movesB = new Move[m];

        // 이동 거리 및 방향 정보 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            movesA[i] = new Move(t, dir);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            movesB[i] = new Move(t, dir);
        }

        // 초마다 위치를 표시할 배열
        int[] posA = new int[2000001];
        int[] posB = new int[2000001];

        // 이동 기록(각각 위치 정보 기록해줘야함)
        int curA = 0, curB = 0;
        int timeA = 0, timeB = 0;

        for (Move move : movesA) {
            String dir = move.dir;
            int time = move.t;

            for (int i = 0; i < time; i++) {
                timeA++;

                if (dir.equals("R")) {
                    curA++;
                } else {
                    curA--; // 왼쪽이면 그냥 음수값으로
                }   

                posA[timeA] = curA;
            }
        }

        for (Move move : movesB) {
            String dir = move.dir;
            int time = move.t;

            for (int i = 0; i < time; i++) {
                timeB++;

                if (dir.equals("R")) {
                    curB++;
                } else {
                    curB--; // 왼쪽이면 그냥 음수값으로
                }   

                posB[timeB] = curB;
            }
        }

        int totalTime = Math.max(timeA, timeB);

        // 남은 시간에 위치 채워주기
        for (int i = timeA + 1; i <= totalTime; i++) {
            posA[i] = curA;
        }

        for (int i = timeB + 1; i <= totalTime; i++) {
            posB[i] = curB;
        }

        int cnt = 0;

        // 위치 비교
        for (int i = 1; i <= totalTime; i++) {
            // A, B 둘다 이전 위치와 변화가 없을 때
            if (posA[i-1] != posB[i-1] && posA[i] == posB[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);





    }
}

// 이동 정보 클래스
class Move {
    int t;
    String dir;

    public Move(int t, String dir) {
        this.t = t;
        this.dir = dir;
    }

}