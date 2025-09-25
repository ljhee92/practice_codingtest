class Solution {
    public void reverseString(char[] s) {
        String word = String.valueOf(s);
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        for (int i = 0; i < s.length; i++) {
            s[i] = reversed.charAt(i);
        }
    }
}