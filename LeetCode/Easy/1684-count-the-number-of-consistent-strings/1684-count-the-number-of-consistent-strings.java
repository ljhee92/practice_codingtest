class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        for (String word : words) {
            if (isContains(allowed, word)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isContains(String allowed, String word) {
        for (char ch : word.toCharArray()) {
            if (allowed.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}