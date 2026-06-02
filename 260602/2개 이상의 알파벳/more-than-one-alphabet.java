import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char start = str.charAt(0);
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != start) {
                flag = true;
                System.out.println("Yes");
                break;
                
            }
        }

        if (!flag) {
            System.out.println("No");
        }




    }
}