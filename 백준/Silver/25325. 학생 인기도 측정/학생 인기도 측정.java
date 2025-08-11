import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학생 수
        int n = Integer.parseInt(br.readLine());
        
        // 학생 이름이 공백으로 구분된 문자열 A
        List<String> names = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            names.add(st.nextToken());
        }

        Map<String, Integer> answer = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            answer.put(name, 0);
        }

        for (int i = 0; i < answer.size(); i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String liked = st.nextToken();
                answer.put(liked, answer.get(liked)+1);
            }
        }
        
        Map<String, Integer> sorted = answer.entrySet().stream()
        .sorted(
            Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey())
        )
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));

        StringBuilder sb = new StringBuilder();
        for (String name : sorted.keySet()) {
            sb.append(name).append(" ").append(sorted.get(name)).append("\n");
        }
        System.out.println(sb);
    }
}
