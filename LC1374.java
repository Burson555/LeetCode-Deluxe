// Runtime: 0 ms, faster than 100.00% of Java online submissions for Generate a String With Characters That Have Odd Counts.
// Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Generate a String With Characters That Have Odd Counts.

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.append('a');
            n--;
        }
        for (int i = 0; i < n ; i++) sb.append('b');
        return sb.toString();
    }
}


// class Solution {
//     public String generateTheString(int n) {
//         if (n == 1) return "a";
//         StringBuilder sb = new StringBuilder();
//         if (n % 2 == 0) {
//             sb.append('a');
//             for (int i = 1; i < n; i++) sb.append('b');
//         } else {
//             sb.append("ab");
//             for (int i = 2; i < n; i++) sb.append('c');
//         }
//         return sb.toString();
//     }
// }