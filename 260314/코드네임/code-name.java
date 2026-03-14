import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] arr = new Agent[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            arr[i] = new Agent(name, score);
        }

        Arrays.sort(arr,new Comparator<Agent>() {
            @Override
            public int compare(Agent arg1, Agent arg2) {
                return arg1.score - arg2.score;
            }
        });

        System.out.println(arr[0].name + " " + arr[0].score);
    }




    static class Agent {
        String name;
        int score;

        public Agent(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}