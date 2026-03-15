import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        System.out.println(checkDate(m1, d1, m2, d2));
    }

    static int checkDate(int m1, int d1, int m2, int d2) {
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int elapsedDays = 0;

        if (((m1 == m2) && (d1 == d2))) return 1;
        


        while (true) {
            if ((m1 == m2) && (d1 == d2)) {

                break;
            }

            elapsedDays++;
            d1++;
            if (d1 > month[m2]) {
                m1++;
                d1 = 1;
            }
        }

        return elapsedDays;
    }
}