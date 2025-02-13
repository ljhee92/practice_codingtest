import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            String[] line = br.readLine().split("");
            int sum = 0;
            int num = 0;
            for (int j = 0; j < line.length; j++) {
                if (line[j].equals("O")) {
                    num++;
                    sum += num;
                } else {
                    num = 0;
                }
            }
            System.out.println(sum);
        }
    }
}