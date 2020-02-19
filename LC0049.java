// Runtime: 6 ms, faster than 98.96% of Java online submissions for Group Anagrams.
// Memory Usage: 45.5 MB, less than 35.67% of Java online submissions for Group Anagrams.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rl = new LinkedList<>();
        if (strs == null) return rl;
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char carr[] = s.toCharArray();
            Arrays.sort(carr);
            String temp = new String(carr);
            if (hm.containsKey(temp)){
                hm.get(temp).add(s);
            } else {
                List<String> tl = new LinkedList<>();
                tl.add(s);
                hm.put(temp, tl);
            }
        }
        for (String temp : hm.keySet()) {
            rl.add(hm.get(temp));
        }
        return rl;
    }
}