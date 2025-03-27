import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            
            if ("0 0 0".equals(line)) {
                break;
            }

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ((a * a + b * b == c * c)
                || (b * b + c * c == a * a)
                || (c * c + a * a == b * b)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}