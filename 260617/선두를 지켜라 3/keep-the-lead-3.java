import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 객체 배열 생성
        Move[] movesA = new Move[n];
        Move[] movesB = new Move[m];

        insertMove(movesA, br);
        insertMove(movesB, br);

        // 위치 배열 (인덱스 = 시간(1s))
        int[] posA = new int[1000001];
        int[] posB = new int[1000001];

        int totalTime = insertPoition(posA, movesA);
        insertPoition(posB, movesB);

        System.out.println(decideFirst(totalTime, posA, posB));


        


    }

    // 객체 배열에 기록
    static void insertMove(Move[] arr, BufferedReader br) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            arr[i] = new Move(v,t);
        }
    }


    // 위치 표현
    static int insertPoition(int[] pos, Move[] moves) {
        int cur = 0, totalTime = 0;

        for (Move move : moves) {
            for(int i = 0; i < move.t; i++) {
                totalTime++;
                cur += move.v;
                pos[totalTime] = cur;
            }
        }

        return totalTime; // 총 이동 시간
    }

    // 판정
    static int decideFirst(int totalTime, int[] posA, int[] posB) {
        int preLeader = 0;
        int cnt = 0;

        for (int i = 0; i <= totalTime; i++) {
            int curLeader = 0;

            if (posA[i] > posB[i]) {
                curLeader = 1;
            } else if (posA[i] < posB[i]) {
                curLeader = 2;
            } else {
                curLeader = 3;
            }

            if (preLeader !=0 && curLeader != preLeader) {
                cnt++;
            }


            preLeader = curLeader;

            
        }

        return cnt;
    }
    
}



class Move {
    int v, t;

    public Move(int v, int t) {
        this.v = v;
        this.t = t;
    }
}