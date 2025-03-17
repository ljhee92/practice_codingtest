import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int answerT = 0;
        for (int num : list) {
            if (num % t != 0) {
                answerT += (num / t) + 1;
            } else {
                answerT += num / t;
            }
        }

        int answerP = n / p;
        int answerP2 = n % p;

        System.out.println(answerT);
        System.out.println(answerP + " " + answerP2);
    }
}