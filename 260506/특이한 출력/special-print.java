import java.util.Scanner;

public class Main {
    // 합이 4인지 판별
    static boolean isFour(int i, int j) {
        return (i + j) % 4 == 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                System.out.print("(" + r + ", " + c + ") ");

                if (isFour(r, c)) System.out.println();
            }
        }
    }
}