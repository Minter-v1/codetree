import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        People[] arr = new People[5];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            People tmp = new People(
                st.nextToken(),
                st.nextToken(),
                st.nextToken()
            );

            arr[i] = tmp;
        }

        System.out.println("name");
        orderByName(arr);

        System.out.println("");

        System.out.println("height");
        orderByHeight(arr);
        
    }


    static void orderByName(People[] arr) {
        Arrays.sort(arr,(a,b) -> a.name.compareTo(b.name));
        
        for (People ins: arr) {
            System.out.println(ins.name + " " + ins.height + " " + ins.weight);
        }
    }

    static void orderByHeight(People[] arr) {
        Arrays.sort(arr,(a,b) -> b.height.compareTo(a.height));

        for (People ins: arr) {
            System.out.println(ins.name + " " + ins.height + " " + ins.weight);
        }
    }
}



class People {
    String name, height, weight;

    public People(String name, String height, String weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}