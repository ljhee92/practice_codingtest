class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        char[] newS = new char[length];
        for (int i = 0; i < length; i++) {
            newS[i] = s[length-i-1];
        }

        for (int i = 0; i < length; i++) {
            s[i] = newS[i];
        }
    }
}