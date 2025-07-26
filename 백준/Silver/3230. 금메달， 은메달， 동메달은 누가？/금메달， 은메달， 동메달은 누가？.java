import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[101];
        int[] answer = new int[101];

        for (int i = 1; i <= n; i++) {
            int rank = Integer.parseInt(br.readLine());
            if (arr[rank] != 0) {
                for (int j = i-1; j >= rank; j--) {
                    arr[j+1] = arr[j];
                }
            }
            arr[rank] = i;
        }

        for (int i = 1; i <= m; i++) {
            int rank = Integer.parseInt(br.readLine());
            int player = arr[m-i+1];
            if (answer[rank] != 0) {
                for (int j = i-1; j >= rank; j--) {
                    answer[j+1] = answer[j];
                }
            }
            answer[rank] = player;
        }

        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
    }
}
