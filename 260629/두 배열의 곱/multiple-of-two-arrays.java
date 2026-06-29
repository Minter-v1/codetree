import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        insertItem(arr1, br);
        br.readLine();
        insertItem(arr2, br);

        mulMatrix(arr1, arr2);
        
        
        
    }

    static void insertItem(int[][] arr, BufferedReader br) throws IOException {
        for (int r = 0; r < 3; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 3; c++) {
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        return;
    }

    // 곱 연산
    static void mulMatrix(int[][] arr1, int[][] arr2) {
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                int num1 = arr1[r][c];
                int num2 = arr2[r][c];
                String mul = Integer.toString(num1 * num2);

                sb.append(mul);

                if (c != 2) {
                    sb.append(" ");
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);

        return;
    }
}