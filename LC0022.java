// Runtime: 0 ms, faster than 100.00% of Java online submissions for Generate Parentheses.
// Memory Usage: 39.5 MB, less than 20.00% of Java online submissions for Generate Parentheses.

// this algorithm is faster because we are using StringBuilder
// which can grow dynalically
// so that is faster than the original string addition
class Solution {
    
    List<String> res_l;
    
    public List<String> generateParenthesis(int n) {
        res_l = new LinkedList<>();
        if (n <= 0) return res_l;
        dfs(n, n, new StringBuilder());
        return res_l;
    }
    
    private void dfs(int num_l, int num_r, StringBuilder sb) {
        // quit condition
        if (num_l == 0 && num_r == 0) {
            res_l.add(sb.toString());
        } else {
            // node selection
            if (num_l != 0) {
                sb.append('(');
                dfs(num_l-1, num_r, sb);
                sb.deleteCharAt(sb.length()-1);
            }
            if (num_r > num_l) {
                sb.append(')');
                dfs(num_l, num_r-1, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}



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