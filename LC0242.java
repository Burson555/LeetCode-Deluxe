// Runtime: 15 ms, faster than 27.78% of Java online submissions for Valid Anagram.
// Memory Usage: 41.7 MB, less than 5.16% of Java online submissions for Valid Anagram.
// Runtime: 16 ms, faster than 26.85% of Java online submissions for Valid Anagram.
// Memory Usage: 41.4 MB, less than 5.16% of Java online submissions for Valid Anagram.
// Runtime: 24 ms, faster than 11.95% of Java online submissions for Valid Anagram.
// Memory Usage: 43.8 MB, less than 5.16% of Java online submissions for Valid Anagram.
// Runtime: 15 ms, faster than 27.78% of Java online submissions for Valid Anagram.
// Memory Usage: 41.4 MB, less than 5.16% of Java online submissions for Valid Anagram.

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            hms.put(temp, 1 + hms.getOrDefault(temp,0));
            temp = t.charAt(i);
            hmt.put(temp, 1 + hmt.getOrDefault(temp,0));
        }
        for (Character c : hms.keySet())
            if (hms.get(c).compareTo(hmt.getOrDefault(c, -1)) != 0) 
                return false;
        return true;
    }
}


// // Runtime: 19 ms, faster than 22.31% of Java online submissions for Valid Anagram.
// // Memory Usage: 41 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 31 ms, faster than 5.71% of Java online submissions for Valid Anagram.
// // Memory Usage: 43.8 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 67 ms, faster than 5.01% of Java online submissions for Valid Anagram.
// // Memory Usage: 43.3 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 18 ms, faster than 24.04% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.2 MB, less than 5.16% of Java online submissions for Valid Anagram.

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;
//         HashMap<Character, Integer> hms = new HashMap<>();
//         HashMap<Character, Integer> hmt = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char temp = s.charAt(i);
//             if (!hms.containsKey(temp))
//                 hms.put(temp, 1);
//             else
//                 hms.put(temp, 1+hms.get(temp));
//             temp = t.charAt(i);
//             if (!hmt.containsKey(temp))
//                 hmt.put(temp, 1);
//             else
//                 hmt.put(temp, 1+hmt.get(temp));
//         }
//         for (Character c : hms.keySet()) {
//             if (!hmt.containsKey(c)) return false;
//             if (hms.get(c).compareTo(hmt.get(c)) != 0) return false;
//         }
//         return true;
//     }
// }