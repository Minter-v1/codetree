import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Student[] arr = new Student[n];
        StringTokenizer st;
    

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Student ins = new Student(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            );

            arr[i] = ins;
        }

        Arrays.sort(arr, (a,b) -> {
            if (a.height == b.height) {
                return b.weight - a.weight;
            }

            return a.height - b.height;
        });

        for (Student ins: arr) {
            System.out.println(ins.height + " " + ins.weight + " " + ins.no);
        }
        


    }
    
}

class Student {
    int height, weight, no;
    static int next = 1;

    public Student(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.no = next++;
    }
}