import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int zero = 0;
        int one = 0;
        
        if (input.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i-1)) {
                if (input.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        
        System.out.println(Math.min(zero, one));
    }
}
