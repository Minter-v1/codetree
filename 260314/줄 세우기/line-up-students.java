import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            arr[i] = new Student(height, weight);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].num);
        }
    }

    static class Student implements Comparable<Student> {
        static int cnt = 1;
        int num, height, weight;

        public Student(int height, int weight) {
            this.num = cnt;
            this.height = height;
            this.weight = weight;

            cnt++;
        }


        @Override
        public int compareTo(Student arg) {
            if (arg.height == this.height) {
                if (arg.weight == this.weight) {
                    return this.num - arg.num;
                }
                return arg.weight - this.weight;
            }
            return arg.height - this.height;
        }
    } 
}