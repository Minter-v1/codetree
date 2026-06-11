import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] arr = new Person[n];

        for (int i = 0; i < n ; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String address = st.nextToken();
            String loc = st.nextToken();
            Person ins = new Person(name, address, loc);

            arr[i] = ins;
        }

        Arrays.sort(arr, (a,b) -> a.name.compareTo(b.name));

        System.out.println("name " + arr[n-1].name);
        System.out.println("addr " + arr[n-1].address);
        System.out.println("city " + arr[n-1].loc);
    }
}


class Person {
    String name, address, loc;

    public Person(String name, String address, String loc) {
        this.name = name;
        this.address = address;
        this.loc = loc;
    }
}