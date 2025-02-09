import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                map.put(numbers[i], map.get(numbers[i])+1);
            } else {
                map.put(numbers[i], 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] finds = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            finds[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int answer = map.getOrDefault(finds[i], 0);
            sb.append(answer).append(" ");
        }
        System.out.println(sb);
    }
}