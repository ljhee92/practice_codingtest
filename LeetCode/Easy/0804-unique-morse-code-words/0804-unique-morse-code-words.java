class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mors = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < alphabets.length; i++) {
            map.put(alphabets[i], mors[i]);
        }

        Set<String> set = new HashSet<>();
        for (String word : words) {
            String temp = "";
            for (int i = 0; i < word.length(); i++) {
                String ch = word.split("")[i];
                String mo = map.get(ch);
                temp += mo;
            }
            set.add(temp);
        }
        return set.size();
    }
}