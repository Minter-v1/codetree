import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCnt = 0;
        int temp = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if ((i > 0) && (arr[i] == arr[i-1])) {
                temp++;
            } else {
                temp += 1;
                maxCnt = Math.max(maxCnt, temp);
                temp = 0;
            }

            
        }

        System.out.println(maxCnt);
    }
}