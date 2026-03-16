import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        System.out.println(decimalNum(binary));
    }

    static int decimalNum(String digit) {
        char[] arr = digit.toCharArray();
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num = num * 2 + ((int)arr[i] - '0');
        }

        return num;
    }
}