import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            if (isPerfectNum(i)) cnt++;
        }

        System.out.println(cnt);
    }


    // 완전수 판별 메서드
    public static boolean isPerfectNum(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }

        return sum == n ? true : false;
    }

}