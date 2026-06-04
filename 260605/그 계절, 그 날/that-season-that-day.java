import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(fn(y,m,d));
    }

    static String fn(int y, int m, int d) {
        int[] months = {
            0,
            31,
            isLunarYear(y),
            31,
            30,
            31,
            30,
            31,
            31,
            30,
            31,
            30,
            31
        };

        // 날짜 존재 여부
        if (months[m] < d) {
            return "-1";
        }

        if ((m >= 3) && (m <= 5)) return "Spring";
        else if ((m >= 6) && (m <= 8)) return "Summer";
        else if ((m >= 9) && (m <= 11)) return "Fall";
        return "Winter";

        


    }

    static int isLunarYear(int y) {
        if (y % 4 == 0) {
            if (y % 400 == 0 && y % 100 == 0) return 29;
            if (y % 100 == 0) {
                return 28;
            } else {
                return 29;
            }
        } else {
            return 28;
        }
    }
}