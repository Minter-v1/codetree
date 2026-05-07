import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int r = n; r >= 1 ; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print((n-r+1) + " * " + c + " = " + (n-r+1)*c);

                if (r != c) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}