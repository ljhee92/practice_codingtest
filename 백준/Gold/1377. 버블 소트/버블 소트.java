import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 2초 -> 2억 번
        // n 최대 -> 500,000, n^2 250,000,000,000 -> 당연 초과..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Info[] arr = new Info[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[i] = new Info(number, i);
        }
        Arrays.sort(arr);
        
        int result = 0;
        for (int i = 0; i < n; i++) { // i == 정렬됐을 때의 인덱스
            int moved = arr[i].index - i;
            result = Math.max(result, moved);
        }
        System.out.println(result+1);
    }
}

class Info implements Comparable<Info> {
    
    int number;
    int index;

    Info(int number, int index) {
        this.number = number;
        this.index = index;
    }
    
    @Override
    public int compareTo(Info o) {
        return number - o.number;
    }
}
