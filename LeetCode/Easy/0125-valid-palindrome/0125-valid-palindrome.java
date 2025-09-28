class Solution {
    public boolean isPalindrome(String s) {
        String onlyAlphabet = s.replaceAll("[^A-Za-z0-9]", "");
        String onlyLowerCase = onlyAlphabet.toLowerCase();
        StringBuilder sb = new StringBuilder(onlyLowerCase);
        String reversed = sb.reverse().toString();
        
        if (!onlyLowerCase.equals(reversed)) {
            return false;
        }

        return true;
    }
}