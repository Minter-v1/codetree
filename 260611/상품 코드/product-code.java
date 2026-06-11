import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Product pd1 = new Product("codetree", "50");
        Product pd2 = new Product(st.nextToken(), st.nextToken());

        System.out.println("product " + pd1.code + " is " + pd1.name);
        System.out.println("product " + pd2.code + " is " + pd2.name);
    }

    
}

class Product {
        String name, code;

        public Product(String name, String code) {
            this.name = name;
            this.code = code;
        }
    }