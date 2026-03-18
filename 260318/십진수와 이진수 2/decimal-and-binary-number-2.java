import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] arr = n.toCharArray();

        changeDigit(changeDecimal(arr));



    }

    // 이진수 변환
    static void changeDigit(int num) {
        int[] arr = new int[100];
        int tmp = 0;

        while (true) {
            if (num == 0) break;

            arr[tmp++] = num % 2;
            num /= 2;
        }

        for (int i = tmp - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        
        return;
    }

    static int changeDecimal(char[] arr) {
        int mul = arr.length - 1;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res += ((int)arr[i] - '0') * Math.pow(2,mul);
            mul--;
        }

        return res * 17;
    }
}