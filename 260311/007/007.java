import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String loc = sc.next();
        int time = sc.nextInt();

        Spy ins = new Spy(code, loc, time);

        System.out.println("secret code : " + ins.code);
        System.out.println("meeting point : " + ins.loc);
        System.out.println("time : " + ins.time);
    }

    static class Spy {
        String code, loc;
        int time;

        public Spy(String code, String loc, int time) {
            this.code = code;
            this.loc = loc;
            this.time = time;
        }
    }
}