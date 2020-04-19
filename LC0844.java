// It is possible to have a space O(1) solution with two pointers.
// However, that implementation would cost a lot of time and efforts.
// SO we just skip writing down that solution.

// Runtime: 1 ms, faster than 62.48% of Java online submissions for Backspace String Compare.
// Memory Usage: 38.3 MB, less than 6.06% of Java online submissions for Backspace String Compare.

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> st = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!ss.empty()) ss.pop();
            } else ss.push(c);
        }
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!st.empty()) st.pop();
            } else st.push(c);
        }
        while ((!ss.empty()) && (!st.empty())) 
            if (ss.pop().compareTo(st.pop()) != 0)
                return false;
        if ((!ss.empty()) || (!st.empty())) return false;
        return true;
    }
}