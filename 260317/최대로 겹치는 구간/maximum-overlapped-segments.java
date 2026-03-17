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

            if (e > maxNum) {
                maxNum = e;
            }

            //음수가 포함된 경우 보정
            if (s < 0) {
                s += 100;
                e += 100;
            }

            

            for (int j = s; j < e; j++) {
                arr[j]++;
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