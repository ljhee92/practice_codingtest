class Solution {
    public List<String> commonChars(String[] words) {
        List<List<String>> list = new ArrayList<>();
        for (String word : words) {
            List<String> chars = Arrays.asList(word.split(""));
            list.add(chars);
        }

        List<String> answer = new ArrayList<>(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            List<String> current = new ArrayList<>(list.get(i));
            List<String> temp = new ArrayList<>();

            for (String ch : answer) {
                if (current.contains(ch)) {
                    temp.add(ch);
                    current.remove(ch);
                }
            }
            answer = temp;
        }
        return answer;
    }
}