import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recursion(n);
    }

    static void recursion(int m) {
        if (m <= 0) return;
        System.out.println("HelloWorld");
        m -= 1;
        recursion(m);
    }
}