class Solution {
    public int majorityElement(int[] nums) {
        int half = nums.length/2;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0)+1);
            if (counts.get(num) > half) {
                return num;
            }
        }
        return -1;
    }
}