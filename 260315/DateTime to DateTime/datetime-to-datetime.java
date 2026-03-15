import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        System.out.println(checkDateTime(A, B, C));
    }

    static int checkDateTime(int a, int b, int c) {
       if (a < 11) return -1;
       if ((a == 11) && (b < 11)) return -1;
       if ((a == 11) && (b == 11) && (c < 11)) return -1;

       int elapsedMin = 0;
       int d = 11, h = 11, m = 11;

       while (true) {
        if ((d == a) && (h == b) && (m == c)) {
            break;
        }

        m++;
        elapsedMin++;
        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
            d++;
        }

       }

       return elapsedMin;
    }
}
       
