import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        // n 만틈 출력 반복
        for (int i = 0; i < n; i++) {
        

            // i 번 만큼 공백 발생시키기
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // n - i개의 숫자 출력
            for (int k = 0; k < n - i; k++) {
                System.out.print(num + " ");
                num++;
                if (num > 9) num = 1;
            }

            System.out.println();
        }
    }
}