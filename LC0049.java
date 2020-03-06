// A takeaway from this problem is that the frequency of letters is a useful feature of string.
// It can be used as a key in HashMap, and it takes only O(n) time to calculate,
// which outperforms sorting.

// Runtime: 17 ms, faster than 26.02% of Java online submissions for Group Anagrams.
// Memory Usage: 45.5 MB, less than 35.67% of Java online submissions for Group Anagrams.

// This solution has better time complexity in theory.
// However, in reality, the running time worsens.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rl = new LinkedList<>();
        if (strs == null) return rl;
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            int count[] = new int[26];
            for (char c : s.toCharArray()) count[c-'a']++;
            StringBuilder sb = new StringBuilder();
            for (int i : count) sb.append(i).append('#');
            String key = sb.toString();
            hm.putIfAbsent(key, new LinkedList<String>());
            hm.get(key).add(s);
        }
        for (String key : hm.keySet()) rl.add(hm.get(key));
        return rl;
    }
}


// // Runtime: 6 ms, faster than 98.96% of Java online submissions for Group Anagrams.
// // Memory Usage: 45.5 MB, less than 35.67% of Java online submissions for Group Anagrams.

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> rl = new LinkedList<>();
//         if (strs == null) return rl;
//         HashMap<String, List<String>> hm = new HashMap<>();
//         for (String s : strs) {
//             char carr[] = s.toCharArray();
//             Arrays.sort(carr);
//             String temp = new String(carr);
//             hm.putIfAbsent(temp, new LinkedList<String>());
//             hm.get(temp).add(s);
//         }
//         for (String temp : hm.keySet()) {
//             rl.add(hm.get(temp));
//         }
//         return rl;
//     }
// }