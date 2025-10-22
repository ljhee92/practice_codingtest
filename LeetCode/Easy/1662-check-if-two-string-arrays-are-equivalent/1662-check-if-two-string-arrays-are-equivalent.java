class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordOfOne = new StringBuilder();
        for (String word : word1) {
            wordOfOne.append(word);
        }

        StringBuilder wordOfTwo = new StringBuilder();
        for (String word : word2) {
            wordOfTwo.append(word);
        }

        return wordOfOne.toString().equals(wordOfTwo.toString());
    }
}