import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[201];
        int temp = 100;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int dist = sc.nextInt();
            String dir = sc.next();

            int start = temp;
            int end;

            

            // 오른쪽으로 가는 경우
            if (dir.equals("R")) {
                end = temp + dist - 1;
                temp = end + 1;

                for (int k = start; k <= end; k++) {
                    arr[k]++;
                }
            } else {
            // 왼쪽으로 가는 경우
                end = temp - dist;
                temp = end - 1;

                for (int k = start; k >= end; k--) {
                    arr[k]++;
                }
            }

        }


        System.out.println(findExtend(arr));


    }

    static int findExtend(int[] arr) {
        int cnt = 0;

        for (int i = 0; i < 200; i++) {
            if (arr[i] >= 2) {
                cnt++;
            }
        }

        return cnt;
    }
}