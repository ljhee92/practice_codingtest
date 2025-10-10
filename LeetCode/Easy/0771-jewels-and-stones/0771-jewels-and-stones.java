class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        String[] jewelsStr = jewels.split("");
        String[] stonesStr = stones.split("");
        for (String jewel : jewelsStr) {
            for (String stone : stonesStr) {
                if (stone.equals(jewel)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}