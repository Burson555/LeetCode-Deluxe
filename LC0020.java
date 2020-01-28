// Runtime: 2 ms, faster than 48.46% of Java online submissions for Valid Parentheses.
// Memory Usage: 39.4 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 1 ms, faster than 98.61% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 5 ms, faster than 8.32% of Java online submissions for Valid Parentheses.
// Memory Usage: 38.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 2 ms, faster than 48.46% of Java online submissions for Valid Parentheses.
// Memory Usage: 39.2 MB, less than 5.06% of Java online submissions for Valid Parentheses.

class Solution {
    public boolean isValid(String s) {
        if (s == null) return true;
        Stack<Character> cs = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                cs.add(c);
            else {
                if (cs.empty()) return false;
                char temp = cs.pop().charValue();
                if (temp == '(' && c == ')') continue;
                else if (temp == '[' && c == ']') continue;
                else if (temp == '{' && c == '}') continue;
                else return false;
            }
        }
        return true;
    }
}