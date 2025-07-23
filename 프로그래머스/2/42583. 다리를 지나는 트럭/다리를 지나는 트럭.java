import java.io.*;
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int total = 0;
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            q.offer(0);
        }
        
        for (int i = 0; i < truck_weights.length; i++) {
            answer++;
            total -= q.poll();
            
            if (total + truck_weights[i] <= weight) {
                q.offer(truck_weights[i]);
                total += truck_weights[i];
            } else {
                q.offer(0);
                i--;
            }
        }
        
        return answer + bridge_length;
    }
}
