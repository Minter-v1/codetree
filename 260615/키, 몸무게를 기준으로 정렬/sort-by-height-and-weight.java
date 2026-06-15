import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Person tmp = new Person(
                st.nextToken(),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            );

            arr[i] = tmp;
        }

        order(arr);

    }

    static void order(Person[] arr) {
        Arrays.sort(arr, (a,b) -> {
            if (a.height == b.height) {
                return b.weight - a.weight;
            }
            return a.height - b.height;
        });

        for (Person ins: arr) {
            System.out.println(ins.name + " " + ins.height + " " + ins.weight);
        }

    }
}

class Person {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}