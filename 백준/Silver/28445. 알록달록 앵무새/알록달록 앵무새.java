import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            set.add(st.nextToken());
            set.add(st.nextToken());
        }

        List<String> list = new ArrayList<>(set); // blue, purple, green
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                sb.append(list.get(i)).append(" ");
                sb.append(list.get(j)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
