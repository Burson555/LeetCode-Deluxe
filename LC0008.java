// Runtime: 1 ms, faster than 100.00% of Java online submissions for String to Integer (atoi).
// Memory Usage: 38.4 MB, less than 5.59% of Java online submissions for String to Integer (atoi).
// Runtime: 1 ms, faster than 100.00% of Java online submissions for String to Integer (atoi).
// Memory Usage: 38.4 MB, less than 5.59% of Java online submissions for String to Integer (atoi).

class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        int start = 0, res = 0;
        for (; start < str.length(); start++)
            if (str.charAt(start) != ' ') break;
        if (start == str.length()) return 0;
        char c = str.charAt(start);
        boolean is_neg = false;
        if (c == '-') {
            is_neg = true;
            start++;
        } else if (c == '+') {
            start++;
        }
        while (start < str.length()) {
            c = str.charAt(start);
            int temp = c-'0';
            if (!(temp >= 0 && temp <= 9)) break;
            if (!is_neg && (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && temp > 7))) 
                return Integer.MAX_VALUE;
            if (is_neg && (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && temp > 8)))
                return Integer.MIN_VALUE;
            res = res*10 + temp;
            start++;
        }
        return is_neg ? -res : res;
    }
}