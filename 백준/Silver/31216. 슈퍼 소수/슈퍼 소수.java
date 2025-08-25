import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        int max = 320000;
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int i = 2; i*i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= max; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        List<Integer> superPrimes = new ArrayList<>();
        for (int i = 0; i < primes.size(); i++) {
            int k = i+1;
            if (isPrime[k]) {
                superPrimes.add(primes.get(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int superPrime = superPrimes.get(n-1);
            sb.append(superPrime).append("\n");
        }
        System.out.println(sb);
    }
}
