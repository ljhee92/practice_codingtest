import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 2.6초 -> 2억 6천
        // N, L 최대 5,000,000 -> ^2 25,000,000,000,000 불가
        // nlogn -> log5*10^6 -> log5 + log10^6 = 1.5 + 6*log10(2.3) = 1.5 + 13.8 = 15.3 -> 5백만 * 15 = 약 7천5백만 -> 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Info[] arr = new Info[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            arr[i] = new Info(number, i);
        }

        Deque<Info> deque = new ArrayDeque<>();  
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst().index <= i-l) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && deque.peekLast().number > arr[i].number) {
                deque.pollLast();
            }

            deque.addLast(arr[i]);
            sb.append(deque.peekFirst().number).append(" ");
        }
        System.out.println(sb);
    }
}

class Info {
    int number;
    int index;

    Info(int number, int index) {
        this.number = number;
        this.index = index;
    }
}
