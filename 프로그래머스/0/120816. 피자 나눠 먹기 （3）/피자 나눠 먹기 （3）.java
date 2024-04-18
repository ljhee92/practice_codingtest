class Solution {
    public int solution(int slice, int n) {
        int quotient = n / slice;
        
        return n % slice != 0 ? quotient + 1 : quotient;
    }
}