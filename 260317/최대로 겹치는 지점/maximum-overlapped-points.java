import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int maxNum = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            if (maxNum < e ) {
                maxNum = e;
            } 

            for (int j = s; j <= e; j++) {
                arr[j]++;
            }

        }

        System.out.println(findMaxNum(arr, maxNum));



    }

    static int findMaxNum(int[] arr, int limit) {
        int maxNum = 0;

        for (int i = 1; i <= limit; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }
}