import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 링크드 리스트 선언
        LinkedList<String> l = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        int n = Integer.parseInt(st.nextToken()); // 식빵개수
        int m = Integer.parseInt(st.nextToken()); // 암호문 개수

        // 문자
        String input = br.readLine();

        // 링크드 리스트에 넣음
        for (char c: input.toCharArray()) {
            l.add(String.valueOf(c)); // 타입 캐스팅
        }

        // 이터레이터 선언
        ListIterator<String> it = l.listIterator();
    
        // 맨 뒤로 위치 시킴
        while(it.hasNext()) {
            it.next();
        }        

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken(); 

            if (order.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (order.equals("R")) {
                if (it.hasNext()) {
                    it.next();
                }

            } else if (order.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else {
                // P인 경우
                String ch = st.nextToken();
                it.add(ch);
                
            }
        }

        // 이터레이터 맨 앞으로(새롭게 할당하면서)
        it = l.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
}