import java.io.*;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        BigInteger factorial = BigInteger.ONE;
        BigInteger end = BigInteger.valueOf(n);
        for (BigInteger i = BigInteger.ONE; i.compareTo(end) <= 0; i = i.add(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }
        
        String value = String.valueOf(factorial);
        int cnt = 0;
        for (int i = value.length()-1; i >= 0; i--) {
            if (value.charAt(i) == '0') {
                cnt++;
            } else {
                break;
            }
        }
        
        System.out.println(cnt);
    }
}
