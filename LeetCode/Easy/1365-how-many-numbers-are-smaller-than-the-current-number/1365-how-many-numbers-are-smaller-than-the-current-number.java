class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < curr) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}