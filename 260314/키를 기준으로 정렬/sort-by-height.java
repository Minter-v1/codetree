import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        People[] arr = new People[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            arr[i] = new People(name, height, weight);

            sc.nextLine();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }
    }

    static class People implements Comparable<People> {
        String name;
        int height, weight;

        public People(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(People arg) {
            return this.height - arg.height;
        }
        
    }
}