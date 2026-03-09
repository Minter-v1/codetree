import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        fn1(n);
        System.out.println();
        fn2(n);
    }


    static void fn1(int n) {
        if (n > 1) {
            fn1(n-1);
        }
        System.out.print(n + " ");
        return;
    }

    static void fn2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        n -= 1;
        fn2(n);
        return;
    }
}