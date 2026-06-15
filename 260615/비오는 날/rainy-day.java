import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Weather[] arr = new Weather[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Weather tmp = new Weather(
                st.nextToken(),
                st.nextToken(),
                st.nextToken()
            );

            arr[i] = tmp;
        }


        Arrays.sort(arr, (a,b) -> a.date.compareTo(b.date));

        for (Weather ins: arr) {
            if (ins.weather.equals("Rain")) {
                System.out.println(ins.date + " " + ins.day + " " + ins.weather);
                break;
            }
        }

        

    }
    
}

class Weather {
    String date, day, weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

}