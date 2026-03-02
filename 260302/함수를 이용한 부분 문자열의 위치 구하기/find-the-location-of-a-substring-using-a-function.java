import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); 
        String pattern = sc.next();

        System.out.println(findPatternIdx(text, pattern));
        
    }

    static int findPatternIdx(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (n < m) return -1;

        // 문자열 순회(등호는 n=m이 같은 경우 때문에 넣음)
        for (int i = 0; i <= n-m ; i++) {
            boolean match = true;

            // 패턴 문자열 순회
            for (int j = 0; j < m; j++) {
                if (text.charAt(i+j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) return i;
        }

        return -1;

    }
}