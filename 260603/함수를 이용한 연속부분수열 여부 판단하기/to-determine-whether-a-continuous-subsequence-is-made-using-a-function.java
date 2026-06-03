import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken()); 

        int[] arrB = new int[b];
        int[] arrA = new int[a];

        st = new StringTokenizer(br.readLine());
        insertItem(a, arrA, st);


        st = new StringTokenizer(br.readLine());
        insertItem(b, arrB, st);



        System.out.println(isContinue(arrA, arrB) ? "Yes" : "No");
        
    }


    static boolean isContinue(int[] a, int[] b) {
        boolean flag = false;

        for (int i = 0; i <= a.length-b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i+j] != b[j]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            
            if (flag) return true;
        }

        return false;
    }


    // 배열 원소 삽입
    static void insertItem(int size, int[] arr, StringTokenizer st) {
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

}