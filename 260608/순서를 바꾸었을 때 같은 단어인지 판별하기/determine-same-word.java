import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arrA = br.readLine().toCharArray();
        char[] arrB = br.readLine().toCharArray();

        if (arrA.length != arrB.length) {
            System.out.println("No");
            return;
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);


        if (isSame(arrA, arrB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static boolean isSame(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }
}