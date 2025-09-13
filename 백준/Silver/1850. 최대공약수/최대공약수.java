import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long countA = Long.parseLong(st.nextToken());
        long countB = Long.parseLong(st.nextToken());

        BigInteger a = new BigInteger(String.valueOf(countA));
        BigInteger b = new BigInteger(String.valueOf(countB));
        BigInteger gcd = a.gcd(b);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd.intValue(); i++) {
            sb.append("1");
        }
        
        System.out.println(sb);
    }
}
