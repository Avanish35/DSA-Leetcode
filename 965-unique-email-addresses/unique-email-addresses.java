class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            // remove everything after '+'
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }

            // remove all dots
            local = local.replace(".", "");

            String cleanedEmail = local + "@" + domain;
            set.add(cleanedEmail);
        }

        return set.size();
    }
}
