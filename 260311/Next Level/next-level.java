import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        User ins = new User(id, level);
        User ins2 = new User("codetree", 10);

        System.out.println("user " + ins2.id + " lv " + ins2.level);
        System.out.println("user " + ins.id + " lv " + ins.level);
    }


    static class User {
        String id;
        int level;

        public User(String id, int level) {
            this.id = id;
            this.level = level;
        }
    }
}