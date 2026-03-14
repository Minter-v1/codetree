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
            int sc1 = sc.nextInt();
            int sc2 = sc.nextInt();
            int sc3 = sc.nextInt();

            arr[i] = new Student(name, sc1, sc2, sc3);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].score1 + " " + arr[i].score2 + " " + arr[i].score3);
        } 
        
    }

    static class Student implements Comparable<Student> {
        String name;
        int score1, score2, score3;

        public Student(String name, int sc1, int sc2, int sc3) {
            this.name = name;
            this.score1 = sc1;
            this.score2 = sc2;
            this.score3 = sc3;
        }
        
        @Override
        public int compareTo(Student arg) {
            return (this.score1 + this.score2 + this.score3) - (arg.score1 + arg.score2 + arg.score3);
        }
    }
}