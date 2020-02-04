// TAKEAWAY #1:
//      if we are to use a fixed size dictionary,
//      we can utilize an array as substitute.
// TAKEAWAY #2:
//      we can always sort an array even if it is not an array of numbers
//      because underneath they are implemented by numbers, i.e., 0's and 1's

// Runtime: 3 ms, faster than 93.37% of Java online submissions for Valid Anagram.
// Memory Usage: 38.8 MB, less than 25.80% of Java online submissions for Valid Anagram.
// Runtime: 3 ms, faster than 93.37% of Java online submissions for Valid Anagram.
// Memory Usage: 39.1 MB, less than 22.58% of Java online submissions for Valid Anagram.
// Runtime: 3 ms, faster than 93.37% of Java online submissions for Valid Anagram.
// Memory Usage: 38.8 MB, less than 28.38% of Java online submissions for Valid Anagram.

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) 
            count[s.charAt(i)-'a']++;
        for (int i = 0; i < s.length(); i++)
            if ((--count[t.charAt(i)-'a']) < 0)
                return false;
        return true;
    }
}


// // Runtime: 3 ms, faster than 93.37% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.5 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 3 ms, faster than 93.37% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.4 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 3 ms, faster than 93.37% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.3 MB, less than 5.16% of Java online submissions for Valid Anagram.

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char arr1[] = s.toCharArray();
//         Arrays.sort(arr1);
//         char arr2[] = t.toCharArray();
//         Arrays.sort(arr2);
//         if (arr1.length != arr2.length) return false;
//         for (int i = 0; i < arr1.length; i++)
//             if (arr1[i] != arr2[i]) 
//                 return false;
//         return true;
//     }
// }


// // Runtime: 15 ms, faster than 27.78% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.7 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 16 ms, faster than 26.85% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.4 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 24 ms, faster than 11.95% of Java online submissions for Valid Anagram.
// // Memory Usage: 43.8 MB, less than 5.16% of Java online submissions for Valid Anagram.
// // Runtime: 15 ms, faster than 27.78% of Java online submissions for Valid Anagram.
// // Memory Usage: 41.4 MB, less than 5.16% of Java online submissions for Valid Anagram.

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;
//         HashMap<Character, Integer> hms = new HashMap<>();
//         HashMap<Character, Integer> hmt = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char temp = s.charAt(i);
//             hms.put(temp, 1 + hms.getOrDefault(temp,0));
//             temp = t.charAt(i);
//             hmt.put(temp, 1 + hmt.getOrDefault(temp,0));
//         }
//         for (Character c : hms.keySet())
//             if (hms.get(c).compareTo(hmt.getOrDefault(c, -1)) != 0) 
//                 return false;
//         return true;
//     }
// }


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