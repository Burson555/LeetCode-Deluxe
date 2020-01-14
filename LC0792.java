// NAIVE SOLUTION

// class Solution {
//     public int numMatchingSubseq(String S, String[] words) {
//         if (S == null || S.length() == 0 || words.length == 0 || words == null)
//             return 0;
//         int count = 0;
//         for (String word: words) {
//             if (this.isSubsequence(word, S))
//                 count++;
//         }
//         return count;
//     }
//     public boolean isSubsequence(String s, String t) {
//         if (s == null || s.length() > t.length())
//             return false;
//         if (s.length() == 0)
//             return true;
//         int char_index = 0;
//         char s_array[] = s.toCharArray();
//         for (char ct: t.toCharArray()) {
//             if (ct == s_array[char_index]){
//                 char_index++;
//                 if (char_index == s.length())
//                     return true;
//             }
//         }
//         return false;
//     }
// }