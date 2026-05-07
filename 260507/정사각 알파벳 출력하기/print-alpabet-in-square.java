import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int character = 65;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = 0;

            while (temp < n) {
                System.out.print((char)character);
                character++;
                temp++;
            }

            System.out.println();
        }
        
    }
}