import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(pivo(n));
    }

    static int pivo(int n) {
        if ((n == 1) || (n == 2)) return 1;
        return pivo(n-1) + pivo(n-2);
        
    }
}