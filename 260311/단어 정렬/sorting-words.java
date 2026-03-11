import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        Arrays.sort(arr);
        
        for(String arg: arr) {
            System.out.println(arg);
        }
    }

    
}