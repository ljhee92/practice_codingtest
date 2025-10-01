class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder sb = new StringBuilder(number);
        String reversed = sb.reverse().toString();
        if (number.equals(reversed)) {
            return true;
        }
        return false;
    }
}