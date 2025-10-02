class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (!word.equals(" ")) {
                list.add(word);
            }
        }
        return list.getLast().length();
    }
}