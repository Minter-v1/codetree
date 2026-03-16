import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        System.out.println(checkDay(m1, d1, m2, d2));
    }


    static String checkDay(int m1, int d1, int m2, int d2) {
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int start = 1; // 요일 구하는 변수

        // 과거
        if (!isFuture(m1,  d1,  m2,  d2)) {
            while (true) {
                if ((m1 == m2) && (d1 == d2)) {
                    break;
                }
                
                d1--;
                start = (start - 1 + 7) % 7;

                if (d1 == 0) {
                    m1--;
                    d1 = month[m1];
                }
            }

        } else {
            // 미래
            while (true) {
                if ((m1 == m2) && (d1 == d2)) {
                    break;
                }

                d1++;
                start = (start + 1) % 7;

                if (d1 > month[m1]) {
                    d1 = 1;
                    m1++;
                }
            }
        }

        return day[start];
    

    }


    static boolean isFuture(int m1, int d1, int m2, int d2) {
        // 과거일 때
        if ((m1 > m2) || ((m1 == m2) && (d1 > d2))) return false;
        return true;
    }
}