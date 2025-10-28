class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patterns = pattern.toCharArray();
        String[] words = s.split(" ");

        if (patterns.length != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();
        for (int i = 0; i < patterns.length; i++) {
            char c = patterns[i];
            String word = words[i];
            
            if (map.containsKey(c) && !map.get(c).equals(word)) {
                return false;
            }

            if (!map.containsKey(c) && usedWords.contains(word)) {
                return false;
            }

            map.put(c, word);
            usedWords.add(word);
        }

        return true;
    }
}