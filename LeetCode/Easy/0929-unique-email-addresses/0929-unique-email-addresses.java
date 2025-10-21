class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> answer = new HashSet<>();
        for (String email : emails) {
            String local = email.split("@")[0];
            String domain = email.split("@")[1];

            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            local = local.replace(".", "");
            
            answer.add(local + "@" + domain);
        }

        return answer.size();
    }
}