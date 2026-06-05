import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fn(n));

    }

    static int fn(int i) {
        if (i == 1) return i;
        return i* fn(i-1);
    }
}