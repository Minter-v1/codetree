import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 연결 리스트 선언
        LinkedList<Integer> dll = new LinkedList<>();

        // 입력 횟수
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                dll.addFirst(num);

            } else if (order.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                dll.addLast(num);

            } else if (order.equals("pop_front")) {
                int val = dll.pollFirst();
                System.out.println(val);

            } else if (order.equals("pop_back")) {
                int val = dll.pollLast();
                System.out.println(val);

            } else if (order.equals("size")) {
                System.out.println(dll.size());

            } else if (order.equals("empty")) {
                System.out.println(dll.isEmpty() ? 1 : 0);

            } else if (order.equals("front")) {
                System.out.println(dll.peekFirst());

            } else {
                // back인 경우
                System.out.println(dll.peekLast());
            }
        }
    }
}