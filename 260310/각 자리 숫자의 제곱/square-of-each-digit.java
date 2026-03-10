import java.util.Scanner;
public class Main {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = num.length() - 1;

        System.out.println(fn(n, num));
    }

    // 문자열 길
    static int fn(int n, String str) {
        if (n >= 0) {
            sum += Math.pow((int)str.charAt(n) - '0', 2);
            fn(n-1,str);
        }

        return sum;
    }
}