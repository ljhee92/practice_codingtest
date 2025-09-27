class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> counts = new HashMap<>();
        for (String ch : s.split("")) {
            counts.put(ch, counts.getOrDefault(ch, 0)+1);
        }

        for (String ch : t.split("")) {
            counts.put(ch, counts.getOrDefault(ch, 0)-1);
        }

        for (int count : counts.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}