import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            if (countDivisor(i) == 3) cnt++;
        }

        System.out.println(cnt);
    }

    // 약수 개수 찾아주는 메서드
    public static int countDivisor(int num) {
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) cnt++;
        }

        return cnt;

    }
}