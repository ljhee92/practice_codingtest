import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        List<Long> list = new ArrayList<>();
        int count = 0;

        while (count < n) { 
            if (st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                list.add(Long.parseLong(sb.reverse().toString()));
                count++;
            } else {
                st = new StringTokenizer(br.readLine());
            }
        }

        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (long num : list) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
