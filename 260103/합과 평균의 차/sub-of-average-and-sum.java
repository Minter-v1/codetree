import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum,avg;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a+b+c;
        avg = (a+b+c)/3;

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum-avg);
    }
}