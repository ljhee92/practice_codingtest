class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!isDuplicate(nums, num)) {
                answer = num;
            }
        }
        return answer;
    }

    private boolean isDuplicate(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }

        if (count != 1) {
            return true;
        }
        return false;
    }
}