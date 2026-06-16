import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); 

        Move[] arrA = new Move[n];
        Move[] arrB = new Move[m];

        int[] posA = new int[1000001];
        int[] posB = new int[1000001];



        // A 이동 정보 저장
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int dis = Integer.parseInt(st.nextToken());

            arrA[i] = new Move(dir, dis);
        }

        // B 이동 정보 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int dis = Integer.parseInt(st.nextToken());

            arrB[i] = new Move(dir, dis);
        }

        // A 위치 기록하기
        int time = 0;
        int cur = 0;

        for (int i = 0; i < n; i++) {
            String dir = arrA[i].dir;
            int moveTime = arrA[i].dis;

            for (int j = 0; j < moveTime; j++) {
                time++;

                if (dir.equals("R")) {
                    cur++;
                } else {
                    cur--;
                }

                posA[time] = cur;
            }
        }

        int totalTimeA = time;

        // B 위치 기록하기
        time = 0;
        cur = 0;

        for (int i = 0; i < m ; i++) {
            String dir = arrB[i].dir;
            int moveTime = arrB[i].dis;

            for (int j = 0; j < moveTime; j++) {
                time++;

                if (dir.equals("R")) {
                    cur++;
                } else {
                    cur--;
                }

                posB[time] = cur;
            }
        }

        int totalTimeB = time;
        int totalTime = Math.max(totalTimeA, totalTimeB);
        boolean flag = false;

        for (int i = 1; i < totalTime; i++) {
            if (posA[i] == posB[i]) {
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }
    }
}


class Move {
    String dir;
    int dis;

    public Move(String dir, int dis) {
        this.dir = dir;
        this.dis = dis;
    }
}