// // Runtime: 7 ms, faster than 76.09% of Java online submissions for Longest Substring Without Repeating Characters.
// // Memory Usage: 41.4 MB, less than 5.20% of Java online submissions for Longest Substring Without Repeating Characters.
// Runtime: 7 ms, faster than 76.09% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 41.3 MB, less than 5.20% of Java online submissions for Longest Substring Without Repeating Characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        HashSet<Character> hs = new HashSet<>();
        int lp = 0, rp = 0, num_char = s.length();
        int res = 0;
        while (rp < num_char) {
            res = Math.max(res, rp-lp);
            while (!hs.add(s.charAt(rp)))
                hs.remove(s.charAt(lp++));
            rp++;
        }
        return Math.max(res, rp-lp);
    }
}