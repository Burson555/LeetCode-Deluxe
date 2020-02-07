// Runtime: 1 ms, faster than 59.79% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 38 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// Runtime: 1 ms, faster than 59.79% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 38.1 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// Runtime: 1 ms, faster than 59.79% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 37.9 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.

// A huge improvement achieved by replacing character string mixed arithmetic
//      with string string arithmetic, i.e., to represent single character using string instead of char
class Solution {
    HashMap<String, String> ht;
    List<String> rl;
    public Solution() {
        ht = new HashMap<String, String>();
        ht.put("2", "abc");
        ht.put("3", "def");
        ht.put("4", "ghi");
        ht.put("5", "jkl");
        ht.put("6", "mno");
        ht.put("7", "pqrs");
        ht.put("8", "tuv");
        ht.put("9", "wxyz");
        rl = new LinkedList<String>();
    }
    
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return this.rl;
        this.create("", digits);
        return this.rl;
    }
    
    private void create(String s, String next_digits) {
        if (next_digits.length() == 0) {
            this.rl.add(s);
        } else {
            String digit    = next_digits.substring(0, 1);
            String letters  = this.ht.get(digit);
            for (int i = 0; i < letters.length(); i++)
                this.create(s+letters.substring(i, i+1), next_digits.substring(1));
        }
    }
}


// // Runtime: 5 ms, faster than 13.33% of Java online submissions for Letter Combinations of a Phone Number.
// // Memory Usage: 38.9 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// // Runtime: 13 ms, faster than 9.01% of Java online submissions for Letter Combinations of a Phone Number.
// // Memory Usage: 40.7 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// // Runtime: 5 ms, faster than 13.33% of Java online submissions for Letter Combinations of a Phone Number.
// // Memory Usage: 38.8 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.

// class Solution {
//     HashMap<Character, String> ht;
//     List<String> rl;
//     public Solution() {
//         ht = new HashMap<Character, String>();
//         ht.put('2', "abc");
//         ht.put('3', "def");
//         ht.put('4', "ghi");
//         ht.put('5', "jkl");
//         ht.put('6', "mno");
//         ht.put('7', "pqrs");
//         ht.put('8', "tuv");
//         ht.put('9', "wxyz");
//         rl = new LinkedList<String>();
//     }
    
//     public List<String> letterCombinations(String digits) {
//         if (digits == null || digits.length() == 0) return this.rl;
//         int curr = 0;
//         this.create("", digits, curr);
//         return this.rl;
//     }
    
//     private void create(String s, String digits, int curr) {
//         if (curr == digits.length()) {
//             this.rl.add(s);
//         } else {
//             String temp = this.ht.get(digits.charAt(curr));
//             for (char c : temp.toCharArray())
//                 this.create(s+c, digits, curr+1);
//         }
//     }
// }


// This method is even slower.
// Runtime: 5 ms, faster than 19.68% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 37.8 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// Runtime: 5 ms, faster than 19.68% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 38.2 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.

class Solution {
    
    String tb[];
    List<String> rl;
    
    public Solution() {
        tb = new String[10];
        tb[2] = "abc";
        tb[3] = "def";
        tb[4] = "ghi";
        tb[5] = "jkl";
        tb[6] = "mno";
        tb[7] = "pqrs";
        tb[8] = "tuv";
        tb[9] = "wxyz";
        rl = new LinkedList<String>();
    }
    
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return this.rl;
        int curr = 0;
        String prev = "";
        while (curr < digits.length()) {
            while (prev.compareTo("") == 0 || prev.length() <= curr){
                String temp = tb[digits.charAt(curr) - '0'];
                for (int i = 0; i < temp.length(); i++)
                    rl.add(prev + temp.charAt(i));
                prev = rl.remove(0);
            }
            curr++;
        }
        rl.add(0, prev);
        return this.rl;
    }
    
    private void create(String s, String digits, int curr) {
        if (curr == digits.length()) {
            this.rl.add(s);
        } else {
            String temp = tb[digits.charAt(curr) - '0'];
            for (char c : temp.toCharArray())
                this.create(s+c, digits, curr+1);
        }
    }
}