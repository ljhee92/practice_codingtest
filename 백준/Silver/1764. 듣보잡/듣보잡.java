import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> listOfN = new ArrayList<>();
        HashSet<String> setOfM = new HashSet<>();

        for (int i = 0; i < N; i++) {
            listOfN.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            setOfM.add(br.readLine());
        }

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < listOfN.size(); i++) {
            if (setOfM.contains(listOfN.get(i))) {
                answer.add(listOfN.get(i));
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}