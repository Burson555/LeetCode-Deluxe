// Runtime: 7 ms, faster than 70.34% of Java online submissions for Check If Word Is Valid After Substitutions.
// Memory Usage: 39.5 MB, less than 27.27% of Java online submissions for Check If Word Is Valid After Substitutions.

class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == 'c') {
                if (s.empty() || s.pop() != 'b') return false;
                if (s.empty() || s.pop() != 'a') return false;
            } else {
                s.push(c);
            }
        }
        if (!s.empty()) return false;
        return true;
    }
}