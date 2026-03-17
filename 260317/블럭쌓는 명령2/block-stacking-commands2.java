import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 총 배열 길이
        int k = sc.nextInt(); // 입력 수

        int[] arr = new int[n+1]; // 인덱스를 칸으로 직접 사용

        for (int i = 0; i < k; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            changeBlock(s, e, arr);
        }

        System.out.println(findMaxNum(arr));
    }

    static void changeBlock(int s, int e, int[] arr) {
        for (int i = s; i <= e; i++) {
            arr[i] += 1;
        }
    }

    static int findMaxNum(int[] arr) {
        int maxNum = 0;
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}