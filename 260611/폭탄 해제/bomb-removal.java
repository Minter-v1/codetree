import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        String color = st.nextToken();
        int second = Integer.parseInt(st.nextToken());

        Candle candle = new Candle(code, color, second);
        print(candle);


    }

    static class Candle {
        String code, color;
        int second;

        public Candle(String code, String color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }
    }

    static void print(Candle arg) {
        System.out.println("code : " + arg.code);
        System.out.println("color : " + arg.color);
        System.out.println("second : " + arg.second);
    }
}