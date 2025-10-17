class Solution {
    public int minDeletionSize(String[] strs) {
        int rowCount = strs.length; // 가로
        int colCount = strs[0].length(); // 세로
        int answer = 0;

        for (int col = 0; col < colCount; col++) { // 세로
            for (int row = 1; row < rowCount; row++) { // 가로
                if (strs[row].charAt(col) < strs[row-1].charAt(col)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}