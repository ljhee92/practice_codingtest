import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(found(num));
        }
    }
    
    private static int found(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 2;
        } else if (num == 3) {
            return 4;
        } else {
            return found(num-1)+found(num-2)+found(num-3);
        }
    }
}