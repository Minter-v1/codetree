import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[201];
        int maxNum = -100;

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            // 양수는 200버대 이므로 모든 수에 대한 보정 필요
            s += 100;
            e += 100;


            for (int j = s; j < e; j++) {
                arr[j]++;
            }

            if (e > maxNum) {
                maxNum = e;
            }
            


        }

        System.out.println(findMaxNum(arr, maxNum));
    }

    static int findMaxNum(int[] arr, int limit) {
        int maxNum = 0;

        for (int i = 1; i <= limit; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }

}