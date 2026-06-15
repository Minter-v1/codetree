import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Location[] arr = new Location[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Location tmp = new Location(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                i+1
            );
            arr[i] = tmp;
        }

        Arrays.sort(arr, (a,b) -> {
            if (a.dist == b.dist) {
                return a.order - b.order;
            }
            return a.dist - b.dist;
        });

        for (Location ins: arr) {
            System.out.println(ins.order);
        }

        
    }

    static int calculateManhattan(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }
}


class Location {
    int x, y, order, dist;

    public Location(int x, int y, int order) {
        this.x = x;
        this.y = y;
        this.order = order;
        this.dist = Main.calculateManhattan(x,y);
    }
}