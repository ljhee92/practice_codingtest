import java.io.*;

public class Main {
    
    static int n;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i < 10; i++) {
            if (isPrime(i)) {
                dfs(i, 1);
            }
        }
        
        System.out.println(sb);
    }
    
    static void dfs(int number, int size) {
        if (size == n) {
            if (isPrime(number)) {
                sb.append(number).append("\n");
            }
            return;
        }
        
        for (int i = 1; i < 10; i++) {
            int nextNumber = number * 10 + i;
            if (i % 2 != 0 && isPrime(nextNumber)) {
                dfs(nextNumber, size+1);
            }
        }
    }
    
    static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        
        int sqrt = (int)Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
