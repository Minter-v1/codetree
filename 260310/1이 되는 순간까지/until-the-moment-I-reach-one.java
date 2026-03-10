import java.util.Scanner;
public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fn(n));
    }

    static int fn(int num) {
        if (num == 1) {
            return cnt;
        }

        cnt += 1;

        if (num % 2 == 0) {
            return fn(num / 2);
        } else {
            return fn(num / 3);
        }
    }
}