import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int destroy = 666;
        int count = 1;
        
        while (n != count) {
            destroy++;
            if (String.valueOf(destroy).contains("666")) {
                count++;
            }
        }
        
        System.out.println(destroy);
    }
}
