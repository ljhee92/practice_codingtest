class Solution {
    public int solution(int n, int k) {
        int cnt = 0;
        for(int i = 10; i <= n; i+=10) {
            cnt++;
            k -= cnt;
            cnt = 0;
        }
        
        int lamb = 12000 * n;
        int drink = 2000 * k;
        return lamb+drink;
    }
}