class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != val) {
                answer.add(num);
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            nums[i] = answer.get(i);
        }

        return answer.size();
    }
}
