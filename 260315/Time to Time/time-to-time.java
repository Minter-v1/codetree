import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(calTime(a, b, c, d));
    }


    static int calTime(int a, int b, int c, int d) {
        int h = a;
        int m = b;
        int time = 0;
        

        while (true) {
            if (m == 60) {
                m = 0;
                h++;
            }

            if ((h == c) && (m == d)) {
                break;
            }

            m++;
            time++;
        }

        return time;
    }
}