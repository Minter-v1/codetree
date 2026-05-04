import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = b;
        boolean flag = false;

        for (int c = 1; c <= 9; c++) {
            if (a == b) {
                System.out.println(temp + " * " + c + " = " + (temp * c));
                flag = true;
            }


            while (temp >= a && flag != true) {
                System.out.print(temp + " * " + c + " = " + (temp * c));

                if (temp != a) {
                    System.out.print(" / ");
                } else {
                    System.out.println();
                }

                temp -= 2;
            }
            
            temp = b;

        }
        
    }
}