import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        basedN(changeDecimal(n, a), b);
    }

    // 10진수로 변경
    static int changeDecimal(int n, int k) {
        String num = String.valueOf(n); // 형 변환
        char[] arr = num.toCharArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += ((int)arr[i] - '0') * Math.pow(k,arr.length-1-i);
        }

        return sum;
        
    }

    // 특정 진수로 변경
    static void basedN(int decimal, int k) {
        int[] arr = new int[100];
        int temp = 0;

        while (decimal > 0) {
            arr[temp++] = decimal % k;
            decimal /= k;
        }

        for (int i = temp-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}