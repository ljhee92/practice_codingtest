class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] != 0) {
                continue;
            }

            for (int j = i; j < nums.length-1; j++) {
                swap(nums, j, j+1);
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
