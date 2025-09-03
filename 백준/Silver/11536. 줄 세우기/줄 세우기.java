import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        List<String> temp = new ArrayList<>(list);
        Collections.sort(temp);

        String answer;
        if (list.equals(temp)) {
            answer = "INCREASING";
        } else {
            Collections.sort(temp, Collections.reverseOrder());

            if (list.equals(temp)) {
                answer = "DECREASING";
            } else {
                answer = "NEITHER";
            }
        }
        System.out.println(answer);
    }
}
