// Runtime: 2 ms, faster than 29.98% of Java online submissions for Fizz Buzz.
// Memory Usage: 42.1 MB, less than 5.40% of Java online submissions for Fizz Buzz.

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> rl = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) 
                s += "Fizz";
            if (i % 5 == 0) 
                s += "Buzz";
            if (s.equals(""))
                s = Integer.toString(i);
            rl.add(s);
        }
        return rl;
    }
}