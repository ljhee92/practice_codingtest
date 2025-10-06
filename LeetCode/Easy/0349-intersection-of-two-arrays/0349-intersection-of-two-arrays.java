class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }

        list1.retainAll(list2);

        return list1.stream()
                .mapToInt(Integer::intValue)
                .distinct()
                .toArray();
    }
}
