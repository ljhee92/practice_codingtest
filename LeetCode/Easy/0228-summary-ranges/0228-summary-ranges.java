class Solution {
    public List<String> summaryRanges(int[] nums) {
        int index = 0;

        List<String> answer = new ArrayList<>();
        while (index < nums.length) {
            int start = nums[index];
            int end = start;
            
            while (index+1 < nums.length && nums[index+1] == nums[index] +1) {
                index++;
                end = nums[index];
            }
            
            if (start == end) {
                answer.add(String.valueOf(start));
            } else {
                answer.add(start + "->" + end);
            }
            index++;
        }

        return answer;
    }
}