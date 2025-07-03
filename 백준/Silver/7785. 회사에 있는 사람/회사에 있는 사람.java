import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int logSize = Integer.parseInt(br.readLine());
        Map<String, String> records = new HashMap<>();

        for (int i = 0; i < logSize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            records.put(name, status);
        }

        List<String> enters = new ArrayList<>();
        Set<String> names = records.keySet();
        for (String n : names) {
            if (records.get(n).equals("enter")) {
                enters.add(n);
            }
        }

        Collections.sort(enters, Collections.reverseOrder());
        for (String n : enters) {
            System.out.println(n);
        }
    }
}