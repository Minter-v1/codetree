import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String character = br.readLine();

        String[] arr = {"L", "E", "B", "R", "O", "S"};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(character)) {
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("None");
        }
    }
}