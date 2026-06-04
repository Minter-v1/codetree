import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        

        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(fn(m,d));

    }

    static String fn(int m, int d) {
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (m > 12 ) {
            return "No";
        }

        return months[m] >= d ? "Yes" : "No";
        
    }


}