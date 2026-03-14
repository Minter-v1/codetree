import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kr = sc.nextInt();
            int en = sc.nextInt();
            int math = sc.nextInt();

            arr[i] = new Student(name, kr, en, math);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].kr + " " + arr[i].en + " " + arr[i].math);
        }
    }


    static class Student implements Comparable<Student> {
        String name;
        int kr, en, math;

        public Student(String name, int kr, int en, int math) {
            this.name = name;
            this.kr = kr;
            this.en = en;
            this.math = math;
        }

        @Override
        public int compareTo(Student arg) {
            if (this.kr == arg.kr) {
                if (this.en == arg.en) {
                    return arg.math - this.math;
                }
                return arg.en - this.en;
            }
            return arg.kr - this.kr;
        }
    }
}