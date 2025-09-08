import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> numberPocket = new HashMap<>();
        Map<String, Integer> namePocket = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            numberPocket.put(i, name);
            namePocket.put(name, i);
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String wantFind = br.readLine();

            if (isNumber(wantFind)) {
                int number = Integer.parseInt(wantFind);
                sb.append(numberPocket.get(number)).append("\n");
            } else {
                sb.append(namePocket.get(wantFind)).append("\n");
            }
        }
        System.out.println(sb);
    }

    static boolean isNumber(String value) {
        return value.matches("\\d+");
    }
}
