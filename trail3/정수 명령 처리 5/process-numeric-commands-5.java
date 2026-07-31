import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        // 입력 횟수
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            
            if (order.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);

            } else if (order.equals("get")) {
                int num = Integer.parseInt(st.nextToken());

                System.out.println(list.get(num-1));
                
            } else if (order.equals("pop_back")) {
                list.remove(list.size()-1);
                

            } else {
                System.out.println(list.size());
            }
        }




    }
}