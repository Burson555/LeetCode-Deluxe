// Runtime: 3 ms, faster than 52.12% of Java online submissions for Intersection of Two Arrays.
// Memory Usage: 39.6 MB, less than 6.75% of Java online submissions for Intersection of Two Arrays.
// Runtime: 2 ms, faster than 98.00% of Java online submissions for Intersection of Two Arrays.
// Memory Usage: 39.8 MB, less than 6.75% of Java online submissions for Intersection of Two Arrays.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int smaller[], bigger[];
        smaller = (nums1.length < nums2.length) ? nums1 : nums2;
        bigger  = (smaller == nums1) ? nums2 : nums1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : smaller)
            hs.add(i);
        HashSet<Integer> rhs = new HashSet<>();
        for (int i : bigger)
            if (hs.contains(i))
                rhs.add(i);
        int length = rhs.size(), i = 0;
        int res[] = new int[length];
        for (int curr : rhs) 
            res[i++] = curr;
        return res;
    }
}