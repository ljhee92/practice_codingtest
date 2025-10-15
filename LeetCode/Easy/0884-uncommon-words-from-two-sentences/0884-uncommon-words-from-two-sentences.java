class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String sum = s1 + " " + s2;
        String[] words = sum.split(" ");
        
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0)+1);
        }

        List<String> answer = new ArrayList<>();
        for (String key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                answer.add(key);
            }
        }

        return answer.toArray(new String[answer.size()]);
    }
}