import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // 시간제한 2초 -> 2억 번
        // n -> 최대 15,000 -> n^2 불가
        // nlogn -> 약 10^4 4*3.3 = 약 13 -> 15,000 * 13 = 195,000 -> 가능
        // m -> 최대 10,000,000 (천만) -> m^2 불가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int start = 0; // 배열 시작 인덱스
        int end = n-1; // 배열 끝 인덱스
        int sum = 0;
        int answer = 0;

        // 투포인터 사용 위해 정렬 -> 정렬 시간복잡도가 nlogn
        Arrays.sort(arr);
        
        // start가 end보다 작을 때
        while (start < end) {
            // 배열에서 포인터가 가리키는 값들을 더하고
            sum = arr[start] + arr[end];

            // 더한 값이 m 이면 정답 카운트, 각 포인터 이동
            if (sum == m) {
                answer++;
                start++;
                end--;
            } else if (sum < m) {
                // 더한 값이 m보다 작으면 시작포인터 증가
                start++;
            } else if (sum > m) {
                // 더한 값이 m보다 크면 끝포인터 감소
                end--;
            }
        }

        System.out.println(answer);
    }
}
