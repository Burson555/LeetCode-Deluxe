// Runtime: 7 ms, faster than 39.27% of Java online submissions for Roman to Integer.
// Memory Usage: 41.3 MB, less than 5.48% of Java online submissions for Roman to Integer.
// Runtime: 6 ms, faster than 53.42% of Java online submissions for Roman to Integer.
// Memory Usage: 41.4 MB, less than 5.48% of Java online submissions for Roman to Integer.
// Runtime: 7 ms, faster than 39.27% of Java online submissions for Roman to Integer.
// Memory Usage: 41.3 MB, less than 5.48% of Java online submissions for Roman to Integer.

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
        String prev = "N";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String curr = s.substring(i, i+1);
            count += hm.get(curr).intValue();
            if (prev.equals("I") && (curr.equals("V") || curr.equals("X")))
                count -= 2*hm.get(prev).intValue();
            else if (prev.equals("X") && (curr.equals("L") || curr.equals("C")))
                count -= 2*hm.get(prev).intValue();
            else if (prev.equals("C") && (curr.equals("D") || curr.equals("M")))
                count -= 2*hm.get(prev).intValue();
            prev = curr;
        }
        return count;
    }
}

// // BELOW IS A FASTER SOLUTION, USING AN INHERENT FEATURE OF ROMAN NUMBERS
// class Solution {
//     public int romanToInt(String s) {
//         if (s == null || s.length() == 0) {
//             return 0;
//         }
//         Map<Character, Integer> map = new HashMap();
//         map.put('I', 1);
//         map.put('V', 5);
//         map.put('X', 10);
//         map.put('L', 50);
//         map.put('C', 100);
//         map.put('D', 500);
//         map.put('M', 1000);

//         int sum = 0;
//         for (int i = 0; i < s.length() - 1; i++) {
//             if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
//                 sum -= map.get(s.charAt(i));
//             } else {
//                 sum += map.get(s.charAt(i));
//             }
//         }
//         return sum + map.get(s.charAt(s.length() - 1));
//     }
// }