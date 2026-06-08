import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
            if (i % 2 == 0) {
                Collections.sort(arr);
                System.out.print(arr.get((i+1)/2) + " ");
            }
        }



    }
}