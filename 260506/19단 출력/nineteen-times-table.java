import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 열이 짝수면 "/" 으로 나가고, 열이 홀수면 줄넘김
        for (int r = 1; r <= 19; r++) {
            for (int c = 1; c <= 19; c++) {
                System.out.print(r + " * " + c + " = " + r*c);
                
                if (c % 2 != 0 && c != 19) {
                    System.out.print(" / ");
                } else {
                    System.out.println();
                }
            }
        }
        
    }
}