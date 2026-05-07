import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 65;
        int n = sc.nextInt();

        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++) {
                System.out.print((char)x);
                x++;
                x = 65 + (x - 65) % 26;

            }

            System.out.println();
        }
    }
}