import java.util.*;
import java.io.*;

public class Main {
    
    static int zero;
    static int one;
    static int zero_plus_one;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            System.out.println(zero + " " + one);
        }
    }
    
    private static void fibonacci(int n) {
        zero = 1;
        one = 0;
        zero_plus_one = 1;
        
        for (int i = 0; i < n; i++) {
            zero = one;
            one = zero_plus_one;
            zero_plus_one = zero + one;
        }
    }
}