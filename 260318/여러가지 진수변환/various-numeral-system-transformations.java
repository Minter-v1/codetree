import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int tmp = 0;

        int n = sc.nextInt();
        int b = sc.nextInt();

        while (true) {
            if (n == 0) {
                break;
            }

            arr[tmp++] = n % b;
            n /= b;

        }

        for (int i = tmp - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        
    }
}
