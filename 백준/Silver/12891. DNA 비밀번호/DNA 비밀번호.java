import java.io.*;
import java.util.*;

public class Main {

    static int[] condition = new int[4];
    static int[] current = new int[4]; // (A, C, G, T)
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        // 2초 -> 2억
        // p, s 최대 1,000,000 -> n^2 불가, nlogn은 약 2천만으로 가능
        // 슬라이딩 윈도우는 O(S)로 백만번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String dna = br.readLine();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            condition[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < p; i++) {
            add(dna.charAt(i));
        }

        if (isPassword()) {
            answer++;
        }
        
        for (int i = p; i < s; i++) {
            add(dna.charAt(i));
            remove(dna.charAt(i-p));
            if (isPassword()) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    static void add(char ch) {
        if (ch == 'A') {
            current[0]++;
        } else if (ch == 'C') {
            current[1]++;
        } else if (ch == 'G') {
            current[2]++;
        } else if (ch == 'T') {
            current[3]++;
        }
    }

    static void remove(char ch) {
        if (ch == 'A') {
            current[0]--;
        } else if (ch == 'C') {
            current[1]--;
        } else if (ch == 'G') {
            current[2]--;
        } else if (ch == 'T') {
            current[3]--;
        }
    }

    static boolean isPassword() {
        for (int i = 0; i < 4; i++) {
            if (current[i] < condition[i]) {
                return false;
            }
        }
        return true;
    }
}
