// Runtime: 3 ms, faster than 20.76% of Java online submissions for Generate Parentheses.
// Memory Usage: 41.2 MB, less than 5.16% of Java online submissions for Generate Parentheses.
// Runtime: 1 ms, faster than 95.75% of Java online submissions for Generate Parentheses.
// Memory Usage: 39.8 MB, less than 17.42% of Java online submissions for Generate Parentheses.
// Runtime: 4 ms, faster than 14.86% of Java online submissions for Generate Parentheses.
// Memory Usage: 41.5 MB, less than 5.16% of Java online submissions for Generate Parentheses.
// Runtime: 4 ms, faster than 14.86% of Java online submissions for Generate Parentheses.
// Memory Usage: 41.2 MB, less than 5.16% of Java online submissions for Generate Parentheses.
// Runtime: 5 ms, faster than 12.05% of Java online submissions for Generate Parentheses.
// Memory Usage: 41.5 MB, less than 5.16% of Java online submissions for Generate Parentheses.

class Solution {
    List<String> sl;
    public Solution() {
        this.sl = new LinkedList<String>();
    }
    
    public List<String> generateParenthesis(int n) {
        int res = 0;
        this.addValid("", n, 0);
        return this.sl;
    }
    
    private void addValid(String s, int n, int res) {
        if (n == 0 && res == 0) {
            sl.add(String.valueOf(s));
        } else if (res == 0) {
            this.addValid(String.valueOf(s)+"(", n-1, res+1);
        } else if (n == 0) {
            this.addValid(String.valueOf(s)+")", n, res-1);
        } else {
            this.addValid(String.valueOf(s)+"(", n-1, res+1);
            this.addValid(String.valueOf(s)+")", n, res-1);
        }
    }
}