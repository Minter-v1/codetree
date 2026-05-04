import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % a == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        
    }
}