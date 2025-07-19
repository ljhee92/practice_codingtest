import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 1; i <= n; i++) {
            String value = String.valueOf(i);
            for (int j = 0; j < value.length(); j++) {
                char a = value.charAt(j);
                if (a - '0' == d) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
