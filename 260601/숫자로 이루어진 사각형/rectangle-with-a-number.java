import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int temp = 1;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (temp > 9) {
                    temp = 1;
                }

                System.out.print(temp + " ");
                temp++;
            }

            System.out.println();
        }
            
            
    }
}