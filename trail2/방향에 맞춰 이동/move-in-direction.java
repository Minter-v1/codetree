import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 동 서 남 북
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1}; // 남쪽 -> 아래로 내려가면 인덱스 증가

        // 시작 위치
        int x = 1000, y = 1000;
        int nx, ny;

        // 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String dir = st.nextToken(); // 방향
            int dirNum;

            // 이동 칸
            int distance = Integer.parseInt(st.nextToken());

            if (dir.equals("N")) {
                dirNum = 3;
            } else if (dir.equals("E")) {
                dirNum = 0;
            } else if (dir.equals("S")) {
                dirNum = 2;
            } else {
                dirNum = 1;
            }
            
            // 다음 위치
            nx = x + distance * dx[dirNum];
            ny = y + distance * dy[dirNum];

            // 현재 위치 갱신해주기
            x = nx;
            y = ny;
        }

        x -= 1000;
        y = 1000 - y;

        System.out.println(x + " " + y);


    }
}