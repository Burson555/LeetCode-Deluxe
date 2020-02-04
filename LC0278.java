// Runtime: 11 ms, faster than 37.69% of Java online submissions for First Bad Version.
// Memory Usage: 36 MB, less than 5.63% of Java online submissions for First Bad Version.
// Runtime: 12 ms, faster than 23.94% of Java online submissions for First Bad Version.
// Memory Usage: 36.5 MB, less than 5.63% of Java online submissions for First Bad Version.
// Runtime: 12 ms, faster than 23.94% of Java online submissions for First Bad Version.
// Memory Usage: 36.4 MB, less than 5.63% of Java online submissions for First Bad Version.

// The runtime statistics are almost the same for both algorithms, the recursive and iterative.
// However when we have a large n, the iterative one is preferred.
// Because less stack memory is required.

// One takeaway from this problem is that, many times you can convert a recursive problem into a iterative one.
// But it is better to use recursion in the beginning for clarity and simplicity.

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low != high) {
            int middle = (high-low)/2 + low;
            if (isBadVersion(middle)) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }
}


// /* The isBadVersion API is defined in the parent class VersionControl.
//       boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         return this.binarySearch(1, n);
//     }
    
//     private int binarySearch(int low, int high) {
//         if (high == low) return high;
//         int middle = (high-low)/2 + low;
//         if (isBadVersion(middle))
//             return this.binarySearch(low, middle);
//         else
//             return this.binarySearch(middle+1, high);
//     }
// }