import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a, b;
        double sum, avg;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        avg = sum / 2;

        System.out.printf("%.0f %.1f",sum, avg);

    }
}