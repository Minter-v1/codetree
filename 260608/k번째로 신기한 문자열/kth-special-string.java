import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> targetArr = new ArrayList<>(); // 타겟 배열
        

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken(); // 타겟 문자열


        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            boolean flag = true;
            
            for (int j = 0; j < t.length(); j++) {
                if (temp.charAt(j) != t.charAt(j)) {
                    flag = false;
                    break;
                }
                
            }

            if (flag) {
                targetArr.add(temp);
            }


        }

        Collections.sort(targetArr);
        System.out.println(targetArr.get(k-1));





    }

    
}