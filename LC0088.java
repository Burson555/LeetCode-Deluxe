// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
// Memory Usage: 38.5 MB, less than 5.94% of Java online submissions for Merge Sorted Array.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
// Memory Usage: 38.6 MB, less than 5.94% of Java online submissions for Merge Sorted Array.
// Runtime: 1 ms, faster than 11.38% of Java online submissions for Merge Sorted Array.
// Memory Usage: 38.3 MB, less than 5.94% of Java online submissions for Merge Sorted Array.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
// Memory Usage: 38.7 MB, less than 5.94% of Java online submissions for Merge Sorted Array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr = 0;
        for (int i = 0; i < n ;i++) {
            int temp = nums2[i];
            while (ptr < m+i && nums1[ptr] <= temp)
                ptr++;
            for (int j = m+i; j > ptr; j--)
                nums1[j] = nums1[j-1];
            nums1[ptr++] = temp;
        }
    }
}