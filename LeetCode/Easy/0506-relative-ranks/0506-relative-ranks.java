class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int num : score) {
            map.put(num, "");
        }
        
        List<Integer> sorted = Arrays.stream(score)
                                .boxed()
                                .collect(Collectors.toList());
        Collections.sort(sorted, Comparator.reverseOrder()); 

        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                map.put(sorted.get(i), "Gold Medal");
            } else if (i == 1) {
                map.put(sorted.get(i), "Silver Medal");
            } else if (i == 2) {
                map.put(sorted.get(i), "Bronze Medal");
            } else {
                map.put(sorted.get(i), String.valueOf(i+1));
            }
       }

        String[] answer = new String[score.length];
        int i = 0;
        for (int key : map.keySet()) {
            answer[i] = map.get(key);
            i++;
        }
        return answer;
    }
}