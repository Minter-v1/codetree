import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String order = br.readLine();

        // dx,dy 배열 생성
        // N, E, S W
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        // 좌표 정보 변수
        int x = 0, y = 0;
        int nx = 0 , ny = 0;
        int dirNum = 0; // 북쪽

        // 문자열 반복 돌기
        for (int i = 0; i < order.length(); i++) {
            // 명령이 L인 경우
            if (order.charAt(i) == 'R') {
                dirNum = (dirNum + 1) % 4; // 모듈로 연산

            }  else if (order.charAt(i) == 'L') {
                dirNum = ((dirNum - 1) + 4) % 4; // 모듈로 연산
            } else {
                // 명령이 F인 경우
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }

            x = nx;
            y = ny;           
        }

        System.out.println(x + " " + y);
    }
}