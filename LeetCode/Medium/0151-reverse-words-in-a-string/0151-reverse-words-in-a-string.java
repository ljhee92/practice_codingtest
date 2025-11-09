class Solution {
    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        List<String> list = Arrays.asList(splited);
        List<String> listWithoutSpace = list.stream().filter(l -> !l.equals("")).toList();
        StringBuilder sb = new StringBuilder();
        for (int i = listWithoutSpace.size()-1; i >= 0; i--) {
            sb.append(listWithoutSpace.get(i)).append(" ");
        }
        return sb.toString().trim();
    }
}
