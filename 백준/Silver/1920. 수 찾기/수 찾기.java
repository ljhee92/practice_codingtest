import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> numbers = new HashSet<>();
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        String line = br.readLine();
        st = new StringTokenizer(line);
        
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            int answer = 0;
            if (numbers.contains(num)) {
                answer = 1;
            }
            System.out.println(answer);
        }
    }
}