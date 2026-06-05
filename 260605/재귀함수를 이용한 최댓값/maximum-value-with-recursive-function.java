import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int size = Integer.parseInt(br.readLine());
       arr = new int[size];

       StringTokenizer st = new StringTokenizer(br.readLine());

       for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
       }

       System.out.println(findMaxNum(size-1,0));

       
    }

    static int findMaxNum(int idx, int max) {
        if (idx == 0) {
            return arr[idx] > max ? arr[idx] : max;
        }

        max = arr[idx] > max ? arr[idx] : max;
        return findMaxNum(idx-1, max);
    }
}