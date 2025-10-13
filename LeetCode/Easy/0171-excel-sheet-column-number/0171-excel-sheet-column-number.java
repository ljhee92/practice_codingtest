class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int number = columnTitle.charAt(i) - 64;
            result = result * 26 + number;
        }
        return result;
    }
}