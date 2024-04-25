class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 10; i++) {
            if(n == factorial(i)) {
                answer = i;
                break;
            } else if (n > factorial(i)) {
                continue;
            } else {
                answer = i-1;
                break;
            } // end else
        } // end for
        
        return answer;
    } // solution
    
    public int factorial(int number) {
        if(number <= 1) {
            return 1;
        } else {
            return number*factorial(number-1);
        } // end else
    } // factorial
}