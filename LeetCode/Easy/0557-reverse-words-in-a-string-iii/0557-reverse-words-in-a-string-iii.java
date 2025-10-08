class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String str : strings) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb = sb.reverse();
            answer.append(sb.toString()).append(" ");
        }
        return answer.toString().trim();
    }
}