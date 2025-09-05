import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 1초 -> 1억
        // n 최대 10, k 최대 1억 -> ?? 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 동전 종류의 개수
        int k = Integer.parseInt(st.nextToken()); // 총 금액
        
        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            coins.add(coin);
        }
        Collections.sort(coins, Collections.reverseOrder());

        int answer = 0;
        for (int coin : coins) {
            answer += k/coin;
            k %= coin;
        }
        System.out.println(answer);
    }
}
