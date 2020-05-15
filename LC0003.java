// Runtime: 5 ms, faster than 86.13% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 39.6 MB, less than 13.69% of Java online submissions for Longest Substring Without Repeating Characters.
// Runtime: 4 ms, faster than 88.15% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 40.1 MB, less than 9.21% of Java online submissions for Longest Substring Without Repeating Characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lp = 0, rp = 0, max_len = 0, n = s.length();
        Set<Character> cs = new HashSet<>();
        while (rp < n) {
            if (!cs.add(s.charAt(rp))) {
                max_len = Integer.max(max_len, cs.size());
                while(s.charAt(lp) != s.charAt(rp))
                    cs.remove(s.charAt(lp++));
                lp += 1;
            }
            rp += 1;
        }
        return Integer.max(max_len, cs.size());
    }
}