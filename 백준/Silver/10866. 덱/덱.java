import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }

            if (command.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }

            if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }
            }

            if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            }

            if (command.equals("size")) {
                System.out.println(deque.size());
            }

            if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            if (command.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.getFirst());
                }
            }

            if (command.equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.getLast());
                }
            }
        }
    }
}