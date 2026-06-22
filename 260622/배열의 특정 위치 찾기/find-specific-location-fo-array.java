import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int evenSum = 0;
        double threeMulAvg = 0;


        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 짝수 판단
            if (i % 2 == 0) {
                evenSum += num;
            }

            // 3의 배수 번째 판단
            if (i % 3 == 0) {
                threeMulAvg += num; 
            }
            
        }

        threeMulAvg = Math.round((threeMulAvg / 3.0) * 10) / 10.0;

        System.out.println(evenSum + " " + String.format("%.1f",threeMulAvg));
        
        



        
    }   
}