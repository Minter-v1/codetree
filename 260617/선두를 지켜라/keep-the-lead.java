import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N, M
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // A와 B의 위치 기록용 배열 (인덱스가 시각 t를 의미)
        int[] posA = new int[1000001];
        int[] posB = new int[1000001];

        // A, B 이동 정보 저장 배열
        Move[] movesA = new Move[n];
        Move[] movesB = new Move[m];

        // A의 (v,t) 입력 받기 -> v로 t초 이동

        // 입력 각 이동 정보 배열에 추가하기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            movesA[i] = new Move(v,t);

        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            movesB[i] = new Move(v,t);

        }

        // A의 현재 위치 포인터, A의 총 이동 시간 체크
        int curA = 0;
        int timeA = 0;

        // A부터 1초마다 위치가 어떻게 변하는지 체크하기
        for (Move move : movesA) {
            for(int i = 0; i < move.t; i++) {
                timeA++;
                curA += move.v;
                posA[timeA] = curA;
            }
        }

        int totalTime = timeA;

        int curB = 0;
        int timeB = 0;

        

        // B도 위치 변화 체크하기
        for (Move move : movesB) {
            for(int i = 0; i < move.t; i++) {
                timeB++;
                curB += move.v;
                posB[timeB] = curB;
            }
        }

        int cnt = 0;
        int preLeader = 0;

        // pos값 비교하기
        for (int i = 1; i <= totalTime; i++) {
            int currentLeader = 0;

            if (posA[i] > posB[i]) {
                currentLeader = 1;
            } else if (posA[i] < posB[i]) {
                currentLeader = 2;
            }

            if (currentLeader == 0) {
                continue;
            }

            if (preLeader != 0 && preLeader != currentLeader) {
                cnt++;
            }

            preLeader = currentLeader;
        }

        System.out.println(cnt);

    }
}

class Move {
    int v, t;
    
    public Move(int v, int t) {
        this.v = v;
        this.t = t;
    }
}