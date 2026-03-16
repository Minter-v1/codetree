import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        digitArray(n);
    }

    static void digitArray(int n) {
        int[] arr = new int[20];
        int cnt = 0;

        while (true) {
            // 몫이 2보다 작아짐
            if (n < 2) {
                arr[cnt++] = n;
                break;
            }
            
            // 넣고 증가시키는거임 0에 넣고.. -> 1로 증가시킴
            arr[cnt++] = n % 2;
            n /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}