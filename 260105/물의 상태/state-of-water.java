import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.println("ice");
        } else if (0 < temp && temp < 100) {
            System.out.println("water");
        } else {
            System.out.println("vapor");
        }
    }
}