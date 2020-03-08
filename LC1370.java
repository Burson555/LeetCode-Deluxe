// Runtime: 3 ms, faster than 85.71% of Java online submissions for Increasing Decreasing String.
// Memory Usage: 39.2 MB, less than 100.00% of Java online submissions for Increasing Decreasing String.

class Solution {
    public String sortString(String s) {
        if (s == null || s.length() == 0) return "";
        char[] ca = new char[26];
        for (int i = 0; i < s.length(); i++)
            ca[(int)(s.charAt(i)-'a')] += 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int count = 0;
            for (int j = 0; j < 52; j++) {
                int i = (j < 26) ? j : 51-j;
                if (ca[i] > 0) {
                    sb.append((char)(i+'a'));
                    ca[i] -= 1;
                    count += 1;
                }
            }
            if (count == 0) break;
        }
        return sb.toString();
    }
}