// Runtime: 2 ms, faster than 93.00% of Java online submissions for Intersection of Two Arrays II.
// Memory Usage: 40 MB, less than 6.45% of Java online submissions for Intersection of Two Arrays II.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int smaller[], bigger[];
        smaller = (nums1.length < nums2.length) ? nums1 : nums2;
        bigger  = (smaller == nums1) ? nums2 : nums1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : smaller)
            if (hm.containsKey(i)) hm.put(i, hm.get(i)+1);
            else hm.put(i, 1);
        List<Integer> rl = new ArrayList<>();
        for (int i : bigger) {
            if (hm.containsKey(i) && hm.get(i) > 0) {
                rl.add(i);
                hm.put(i, hm.get(i)-1);
            }
        }
        int length = rl.size();
        int res[] = new int[length];
        for (int i = 0; i < length; i++) 
            res[i] = rl.get(i);
        return res;
    }
}