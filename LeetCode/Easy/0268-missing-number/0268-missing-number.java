class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(nums[i]);
        }

        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (!numbers.contains(i)) {
                answer = i;
            }
        }
        return answer;
    }
}