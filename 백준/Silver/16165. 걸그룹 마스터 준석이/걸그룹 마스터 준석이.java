import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String team = br.readLine();
            int numbers = Integer.parseInt(br.readLine());

            List<String> people = new ArrayList<>();
            for (int j = 0; j < numbers; j++) {
                people.add(br.readLine());
            }

            Collections.sort(people);
            map.put(team, people);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String teamOrName = br.readLine();
            int option = Integer.parseInt(br.readLine());

            if (option == 1) {
                for (String group : map.keySet()) {
                    if (map.get(group).contains(teamOrName)) {
                        sb.append(group).append("\n");
                    }
                }
            } else if (option == 0) {
                List<String> names = map.get(teamOrName);
                for (int j = 0; j < names.size(); j++) {
                    sb.append(names.get(j)).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
