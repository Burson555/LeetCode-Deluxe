// Runtime: 1 ms, faster than 93.46% of Java online submissions for Count and Say.
// Memory Usage: 36.8 MB, less than 47.37% of Java online submissions for Count and Say.

// The only difference I made here was to replace string addition (using "+")
// by Java StringBuilder class, which is easy to use and FAST.
class Solution {
    public String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev;
        int count = 1;
        while (n > count++) {
            prev = curr;
            curr = new StringBuilder();
            char c = prev.charAt(0);
            int num_c = 1;
            for (int i = 1; i < prev.length(); i++) {
                if (c != prev.charAt(i)) {
                    curr.append(num_c).append(c);
                    c = prev.charAt(i);
                    num_c = 1;
                } else {num_c++;}
            }
            curr.append(num_c).append(c);
        }
        return curr.toString();
    }
}


// // NO BETTER
// // Runtime: 19 ms, faster than 9.62% of Java online submissions for Count and Say.
// // Memory Usage: 41.4 MB, less than 5.26% of Java online submissions for Count and Say.

// class Solution {
//     public String countAndSay(int n) {
//         String rs = "1";
//         int count = 1;
//         while (n > count++) {
//             int i = 0, j = 0;
//             String new_rs = "";
//             while (i < rs.length()) {
//                 char c = rs.charAt(j);
//                 for (i = j+1; i < rs.length(); i++)
//                     if (c != rs.charAt(i))
//                         break;
//                 String substring = rs.substring(j, i);
//                 j = i;
//                 new_rs += (Integer.toString(substring.length()) + substring.substring(0, 1));
//             }
//             rs = new_rs;
//         }
//         return rs;
//     }
// }

// // THE FOLLOWING IS THE ORIGINAL VERSION, THE REDUNDANT RECURSION VERSION
// // Runtime: 17 ms, faster than 8.98% of Java online submissions for Count and Say.
// // Memory Usage: 41.8 MB, less than 5.26% of Java online submissions for Count and Say.
// // Runtime: 19 ms, faster than 7.56% of Java online submissions for Count and Say.
// // Memory Usage: 41.7 MB, less than 5.26% of Java online submissions for Count and Say.
// // Runtime: 26 ms, faster than 5.29% of Java online submissions for Count and Say.
// // Memory Usage: 52.2 MB, less than 5.26% of Java online submissions for Count and Say.
// // Runtime: 22 ms, faster than 5.65% of Java online submissions for Count and Say.
// // Memory Usage: 52.3 MB, less than 5.26% of Java online submissions for Count and Say.
// // Runtime: 18 ms, faster than 8.35% of Java online submissions for Count and Say.
// // Memory Usage: 42 MB, less than 5.26% of Java online submissions for Count and Say.

// class Solution {
//     public String countAndSay(int n) {
//         return this.create(n, 1);
//     }
    
//     private String create(int n, int level) {
//         if (n <= 1 || level == n) return "1";
//         String rs   = "";
//         String prev = this.create(n, level+1);
//         int i = 0, j = 0;
//         while (i < prev.length()) {
//             char c = prev.charAt(j);
//             for (i = j+1; i < prev.length(); i++)
//                 if (c != prev.charAt(i))
//                     break;
//             String sub = prev.substring(j, i);
//             j = i;
//             rs += (Integer.toString(sub.length()) + sub.substring(0, 1));
//         }
//         return rs;
//     }
// }