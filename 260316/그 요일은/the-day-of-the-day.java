import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        sc.nextLine();

        String day = sc.nextLine();

        System.out.println(calculateDay(m1, d1, m2, d2, day));

        
    }

    static int calculateDay(int m1, int d1, int m2, int d2, String d) {
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int start = 0, target = 0;
        int cnt = 0;

        start = Arrays.asList(day).indexOf("Mon");
        target = Arrays.asList(day).indexOf(d);

        


        while (true) {
            if ((m1 == m2) && (d1 == d2)) {
                break;
            }

            d1++;
            start = (start + 1) % 7;

            if (start == target) {
                cnt++;
            }


            if (d1 > month[m1]) {
                d1 = 1;
                m1++;
            }
        }

        return cnt;

    }
}