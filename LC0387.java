// Runtime: 51 ms, faster than 17.69% of Java online submissions for First Unique Character in a String.
// Memory Usage: 52.4 MB, less than 5.71% of Java online submissions for First Unique Character in a String.
// Runtime: 62 ms, faster than 7.19% of Java online submissions for First Unique Character in a String.
// Memory Usage: 51.8 MB, less than 5.71% of Java online submissions for First Unique Character in a String.
// Runtime: 22 ms, faster than 63.43% of Java online submissions for First Unique Character in a String.
// Memory Usage: 42.1 MB, less than 5.71% of Java online submissions for First Unique Character in a String.
// Runtime: 23 ms, faster than 62.81% of Java online submissions for First Unique Character in a String.
// Memory Usage: 42.3 MB, less than 5.71% of Java online submissions for First Unique Character in a String.
// Runtime: 24 ms, faster than 62.39% of Java online submissions for First Unique Character in a String.
// Memory Usage: 42.6 MB, less than 5.71% of Java online submissions for First Unique Character in a String.

// Actually the space complexity is constant, because we have at most 26 keys in the HashMap,
//      which will not grow propotionally to the size of input.

// Now we need some reflection on why we must maintain a HashMap to achieve O(N) time complexity.
// First of all, the most simple to implement approach is to use brute force.
//      We loop through every character in the string, and check whether rest of the string contains the exact character.
//      If this character is found in the rest of the string, it is a duplicate, not unique.
//      We the skip to the next character of string and redo the checking.
//      If we found the unique character, just return the index, the position.
//      Otherwise, we loop throught the string and found no unique character. We simply return -1.
//      However, this approach costs O(N^2) time obviously.
// What if we just want go through the String several times?
//      Suppose we are in the middle of the string,
//      the only way we don't have to go through it N times is 
//      we have the knowledge what characters we have visited previously.
//      Since we are not able to use one or two vairables to record the history,
//      a HashMap is then necessary to keep memory of the past.

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++)
            if (hm.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }
}


// // WHY THE FOLLOWING CODE IS NOT WORKING?
// class Solution {
//     public int firstUniqChar(String s) {
//         int count[] = new int[26];
//         int index[] = new int[26];
//         for (int i = 0; i < 26; i++){
//             count[i] = 0;
//             index[i] = -1;
//         }
//         for (int i = 0; i < s.length(); i++) {
//             char c  = s.charAt(i);
//             int pos = (int)(c-'a');
//             count[pos] += 1;
//             if (count[pos] == 1)
//                 index[pos] = i;
//         }
//         for (int i = 0; i < s.length(); i++)
//             if (count[i] == 1)
//                 return index[i];
//         return -1;
//     }
// }
// // Because what we return is the first unique letter in alphabetical order, 
// //       rather than the order of the string.
