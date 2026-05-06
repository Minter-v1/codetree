import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1;

        while (row <= n) {
            for (int col = 1; col <= n; col++) {
                System.out.println(row + " * " + col + " = " + row * col);
            }
            row++;
        }

    }
}