// Runtime: 11 ms, faster than 37.69% of Java online submissions for First Bad Version.
// Memory Usage: 36 MB, less than 5.63% of Java online submissions for First Bad Version.
// Runtime: 12 ms, faster than 23.94% of Java online submissions for First Bad Version.
// Memory Usage: 36.5 MB, less than 5.63% of Java online submissions for First Bad Version.
// Runtime: 12 ms, faster than 23.94% of Java online submissions for First Bad Version.
// Memory Usage: 36.4 MB, less than 5.63% of Java online submissions for First Bad Version.

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return this.binarySearch(1, n);
    }
    
    private int binarySearch(int low, int high) {
        if (high == low) return high;
        int middle = (high-low)/2 + low;
        if (isBadVersion(middle))
            return this.binarySearch(low, middle);
        else
            return this.binarySearch(middle+1, high);
    }
}