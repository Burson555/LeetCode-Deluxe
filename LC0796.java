// Runtime: 1 ms, faster than 30.60% of Java online submissions for Rotate String.
// Memory Usage: 39.1 MB, less than 6.45% of Java online submissions for Rotate String.
// Runtime: 1 ms, faster than 30.60% of Java online submissions for Rotate String.
// Memory Usage: 39.1 MB, less than 6.45% of Java online submissions for Rotate String.

class Solution {
    public boolean rotateString(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return false;
        int length = A.length();
        HashSet<String> hs = new HashSet<>();
        hs.add(A);
        for (int i = 1; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(A.substring(i, length)).append(A.substring(0, i));
            hs.add(sb.toString());
        }
        return hs.contains(B);
    }
}