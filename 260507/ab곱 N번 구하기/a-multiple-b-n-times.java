import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int ans = 1;

            for (int k = s; k <= e; k++) {
                ans *= k;
            }

            System.out.println(ans);
        }
    }
}