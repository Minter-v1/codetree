import java.util.Scanner;

public class Main {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fn(n));
    }

    static int fn(int n) {
        if (n > 0) {
            sum += n;
            fn(n-1);
        }

        return sum;
    }
}