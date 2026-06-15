import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Position[] arr = new Position[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            
            Position tmp = new Position(
                i,
                Integer.parseInt(st.nextToken())
            );

            arr[i] = tmp;
        }

        Arrays.sort(arr, (a,b) -> a.val - b.val);
        int i = 0;

        for (Position ins: arr) {
            ins.post = i;
            i++;
        }

        Arrays.sort(arr, (a,b) -> a.pre - b.pre);

        for(Position ins: arr) {
            System.out.print((ins.post+1) + " ");
        }

    }
}


class Position {
    int pre, post, val;

    // 인덱스 기준
    public Position(int pre, int val) {
        this.pre = pre;
        this.post = 0;
        this.val = val;
    }
}