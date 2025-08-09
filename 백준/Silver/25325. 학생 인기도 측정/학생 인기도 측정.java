import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(), 0);
        }
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String liked = st.nextToken();
                map.put(liked, map.get(liked) + 1);
            }
        }
        
        List<String> names = new ArrayList<>(map.keySet());
        names.sort((a, b) -> {
            int diff = map.get(b) - map.get(a);
            if (diff == 0) return a.compareTo(b);
            return diff;
        });
        
        for (String name : names) {
            System.out.println(name + " " + map.get(name));
        }
    }
}
