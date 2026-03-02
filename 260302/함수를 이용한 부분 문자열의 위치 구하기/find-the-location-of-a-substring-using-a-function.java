import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); 
        String pattern = sc.next();

        System.out.println(findPatternIdx(text, pattern));
        
    }

    static int findPatternIdx(String text, String pattern) {
        // 패턴을 문자열 배열로 변환
        char[] arr = pattern.toCharArray();
        int arrLength = arr.length; 
        boolean flag = false;
        int start = -1;


        // 텍스트 순환
        for (int i = 0; i < text.length() ; i++) {

            // 첫 번째와 일치 여부 
            if (text.charAt(i) == arr[0]) {
                start = i;

                if (arrLength == 1) {
                    return start;
                }

                for (int j = 1; j < arrLength; j++) {

                    if (text.charAt(i+j) != arr[j]) {
                        break;
                    } else {
                        flag = true;
                    }

                }
            }
            
            if (flag) {
                break;
            } else {
                start = -1;
            }
        }

        return start;
    }
}