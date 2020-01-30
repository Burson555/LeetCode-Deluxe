// Runtime: 17 ms, faster than 8.98% of Java online submissions for Count and Say.
// Memory Usage: 41.8 MB, less than 5.26% of Java online submissions for Count and Say.
// Runtime: 19 ms, faster than 7.56% of Java online submissions for Count and Say.
// Memory Usage: 41.7 MB, less than 5.26% of Java online submissions for Count and Say.
// Runtime: 26 ms, faster than 5.29% of Java online submissions for Count and Say.
// Memory Usage: 52.2 MB, less than 5.26% of Java online submissions for Count and Say.
// Runtime: 22 ms, faster than 5.65% of Java online submissions for Count and Say.
// Memory Usage: 52.3 MB, less than 5.26% of Java online submissions for Count and Say.
// Runtime: 18 ms, faster than 8.35% of Java online submissions for Count and Say.
// Memory Usage: 42 MB, less than 5.26% of Java online submissions for Count and Say.

class Solution {
    public String countAndSay(int n) {
        return this.create(n, 1);
    }
    
    private String create(int n, int level) {
        if (n <= 1 || level == n) return "1";
        String rs   = "";
        String prev = this.create(n, level+1);
        int i = 0, j = 0;
        while (i < prev.length()) {
            char c = prev.charAt(j);
            for (i = j+1; i < prev.length(); i++)
                if (c != prev.charAt(i))
                    break;
            String sub = prev.substring(j, i);
            j = i;
            rs += (Integer.toString(sub.length()) + sub.substring(0, 1));
        }
        return rs;
    }
}