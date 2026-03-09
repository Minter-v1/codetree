import java.util.Scanner;
public class Main {
    static int[] arr;
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(recursion(m, sum));
    }

    static int recursion(int m, int sum) {
        if (m <= 0) return sum;

        sum += arr[m];

        if (m % 2 != 0) {
            m -= 1;
        } else {
            m /= 2;
        }

        return recursion(m, sum);
    }
}