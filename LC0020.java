// Runtime: 1 ms, faster than 98.61% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 1 ms, faster than 98.61% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 2 ms, faster than 48.46% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 1 ms, faster than 98.61% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.8 MB, less than 5.06% of Java online submissions for Valid Parentheses.

class Solution {
    public boolean isValid(String s) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put(")", "(");
        hm.put("]", "[");
        hm.put("}", "{");
        Stack<String> ss = new Stack<String>();
        
        for (int i = 0; i < s.length(); i++) {
            String curr = s.substring(i, i+1);
            if (hm.keySet().contains(curr)){
                if (ss.empty()) return false;
                else if (hm.get(curr).equals(ss.pop())) continue;
                else return false;
            } else {
                ss.add(curr);
            } 
        }
        
        return (ss.empty()) ? true : false;
    }
}



// Runtime: 2 ms, faster than 48.46% of Java online submissions for Valid Parentheses.
// Memory Usage: 39.4 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 1 ms, faster than 98.61% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 5 ms, faster than 8.32% of Java online submissions for Valid Parentheses.
// Memory Usage: 38.7 MB, less than 5.06% of Java online submissions for Valid Parentheses.
// Runtime: 2 ms, faster than 48.46% of Java online submissions for Valid Parentheses.
// Memory Usage: 39.2 MB, less than 5.06% of Java online submissions for Valid Parentheses.

// class Solution {
//     public boolean isValid(String s) {
//         if (s == null) return true;
//         Stack<Character> cs = new Stack<Character>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '(' || c == '[' || c == '{')
//                 cs.add(c);
//             else {
//                 if (cs.empty()) return false;
//                 char temp = cs.pop().charValue();
//                 if (temp == '(' && c == ')') continue;
//                 else if (temp == '[' && c == ']') continue;
//                 else if (temp == '{' && c == '}') continue;
//                 else return false;
//             }
//         }
//         return true;
//     }
// }