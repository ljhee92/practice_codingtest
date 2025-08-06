import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // 시간제한 2초 -> 2억 번 연산 가능
        // n 최대 2,000 -> n^2 4,000,000 가능
        
        // n 입력 받고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 0 ~ n까지 arr 입력 받고
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n-1;
            int num = arr[i];
            
            while (start < end) {
                int sum = arr[start] + arr[end];

                if (sum == num) {
                    if (start != i && end != i) {
                        answer++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if (sum < num) {
                    start++;
                } else if (sum > num) {
                    end--;
                }
            }
        }
        System.out.println(answer);
    }
}
