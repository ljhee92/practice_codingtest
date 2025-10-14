class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        if (numRows == 0) {
            return answer;
        }

        answer.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = answer.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 1; j < prev.size(); j++) {
                curr.add(prev.get(j-1) + prev.get(j));
            }

            curr.add(1);
            answer.add(curr);
        }

        return answer;
    }
}