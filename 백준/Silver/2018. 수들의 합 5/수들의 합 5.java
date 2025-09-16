import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (start <= n) {
            if (sum == n) {
                count++;
                sum -= start;
                start++;
            } else if (sum < n) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }
        
        System.out.println(count);
    }
}
