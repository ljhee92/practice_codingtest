import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[] info = new int[3];
    static int[] oversight = new int[3];
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            info[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            oversight[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, -1, 0);
        System.out.println(answer);
    }

    private static void dfs(int day, int prevPlace, int sum) {
        if (day == n) {
            if (sum >= m){
                answer++;
            }
            return;
        }

        for (int place = 0; place < 3; place++) {
            int infoProgress = info[place];
            if (place == prevPlace) {
                infoProgress /= 2;
            }
            dfs(day+1, place,  sum+infoProgress);

            int oversightProgress = oversight[place];
            if (place == prevPlace) {
                oversightProgress /= 2;
            }
            dfs(day+1, place, sum+oversightProgress);
        }
    }
}
