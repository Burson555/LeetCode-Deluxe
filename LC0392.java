// There are several takeaways from this problem
// I:   The runtime and memory use can vary each time we run the program,
//      therefore, the Runtime and Memory Usage statistics may not be accurate.
// II:  Calling length() function is pretty fast,
//      as fast as we store it into a integer variable
// III: Calling String.charAt(index) is significantly slower in accessing characters
//      than calling char_array[index]

// BEST RESULT
// Runtime: 4 ms, faster than 89.05% of Java online submissions for Is Subsequence.
// Memory Usage: 49.1 MB, less than 100.00% of Java online submissions for Is Subsequence.

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() > t.length())
            return false;
        if (s.length() == 0)
            return true;
        
        int char_index = 0;
        char s_array[] = s.toCharArray();
        for (char ct: t.toCharArray()) {
            if (ct == s_array[char_index]){
                char_index++;
                if (char_index == s.length())
                    return true;
            }
        }
        
        return false;
    }
}