import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 시간 제한 2초 - 2억 번
        // n 최대 10,000,000 (천만)
        // n^2 100,000,000,000,000 -> 불가
        // nlogn 천만은 10^7이니까 7*3.3 = 약 23 -> 230,000,000 -> 2억 3천 -> 불가

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1부터 n까지 시작점, 끝점 잡고
        // 누적합이 n보다 같으면 count 증가, 시작점값 누적합에서 뺌, 시작점 증가
        // 누적합이 n보다 작으면 끝점 증가, 끝점값 누적합에 추가
        // 누적합이 n보다 크면 시작점값 누적합에서 뺌, 시작점 증가
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
            } else if (sum > n) {
                sum -= start;
                start++;
            }
        }

        System.out.println(count);
    }
}
