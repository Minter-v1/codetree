import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.

        print(isPalindrome(input));
    }


    static boolean isPalindrome(String str) {

        int maxPivot = (str.length() / 2) - 1;
        int hap = str.length() - 1;

        for (int i = 0; i <= maxPivot; i++) {
            if (str.charAt(i) != str.charAt(hap-i)) return false;
        }

        return true;
    }

    static void print(boolean res) {
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}