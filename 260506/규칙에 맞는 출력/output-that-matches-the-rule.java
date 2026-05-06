import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int r = 0; r < n; r++) {
            for (int c = n - r; c <= n; c++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}