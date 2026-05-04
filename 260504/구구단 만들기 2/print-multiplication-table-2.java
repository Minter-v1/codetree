import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = (a == b ? true : false);

        for (int c = 2; c <= 8; c += 2) {
            int temp = b;

            while (!flag && temp >= a) {
                System.out.print( temp +  " * " +  c + " = " + (temp * c));

                if (temp != a) {
                    System.out.print(" / ");
                } else {
                    System.out.println();
                }

                temp--;
            }

            if (flag) {
                System.out.println( temp +  " * " +  c + " = " + (temp * c));
            }
            
        }
            
    }
}
