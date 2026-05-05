import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int r = n; r > 0; r--) {
            for (int i = 0; i < n - r; i++) {
                System.out.print("  ");
            }
            for (int c = r; c > 0; c--) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}