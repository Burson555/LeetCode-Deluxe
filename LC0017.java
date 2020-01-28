// Runtime: 5 ms, faster than 13.33% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 38.9 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// Runtime: 13 ms, faster than 9.01% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 40.7 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.
// Runtime: 5 ms, faster than 13.33% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 38.8 MB, less than 6.16% of Java online submissions for Letter Combinations of a Phone Number.

class Solution {
    HashMap<Character, String> ht;
    List<String> rl;
    public Solution() {
        ht = new HashMap<Character, String>();
        ht.put('2', "abc");
        ht.put('3', "def");
        ht.put('4', "ghi");
        ht.put('5', "jkl");
        ht.put('6', "mno");
        ht.put('7', "pqrs");
        ht.put('8', "tuv");
        ht.put('9', "wxyz");
        rl = new LinkedList<String>();
    }
    
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return this.rl;
        int curr = 0;
        this.create("", digits, curr);
        return this.rl;
    }
    
    private void create(String s, String digits, int curr) {
        if (curr == digits.length()) {
            this.rl.add(s);
        } else {
            String temp = this.ht.get(digits.charAt(curr));
            for (int i = 0; i < temp.length(); i++) {
                char c = temp.charAt(i);
                this.create(String.valueOf(s)+c, digits, curr+1);
            }
        }
    }
}