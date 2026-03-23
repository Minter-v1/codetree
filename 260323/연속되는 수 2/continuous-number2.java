import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCnt = 0;
        int temp = 1;
        int[] arr = new int[n];

        if (n == 1) {
            System.out.println(1);
            System.exit(0);
        }


        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if (i == 0) continue;

            if (arr[i] == arr[i-1]){
                temp++;
            } else {
                temp = 1;
            }

            maxCnt = Math.max(maxCnt, temp);

            
        }

        System.out.println(maxCnt);
    }
}