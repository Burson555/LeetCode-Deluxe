// Runtime: 93 ms, faster than 50.00% of Java online submissions for Minimum Number of Frogs Croaking.
// Memory Usage: 53.3 MB, less than 100.00% of Java online submissions for Minimum Number of Frogs Croaking.

class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs.length() % 5 != 0) return -1;
        Map<Character, Integer> hs = new HashMap<>();
        hs.put('c', 0); hs.put('r', 0);
        hs.put('o', 0); hs.put('a', 0);
        int res = 1;
        for (char curr : croakOfFrogs.toCharArray()) {
            switch (curr) {
                case 'c':
                    hs.put('c', hs.get('c')+1);
                    break;
                case 'r':
                    hs.put('r', hs.get('r')+1);
                    if (hs.get('r') > hs.get('c')) return -1;
                    break;
                case 'o':
                    hs.put('o', hs.get('o')+1);
                    if (hs.get('o') > hs.get('r')) return -1;
                    break;
                case 'a':
                    hs.put('a', hs.get('a')+1);
                    if (hs.get('a') > hs.get('o')) return -1;
                    break;
                default:
                    int c = hs.get('c'), r = hs.get('r');
                    int o = hs.get('o'), a = hs.get('a');
                    res = Integer.max(res, c--);
                    res = Integer.max(res, r--);
                    res = Integer.max(res, o--);
                    res = Integer.max(res, a--);
                    if (c < 0 || r < 0 || o < 0 || a < 0) return -1;
                    hs.put('c', c); hs.put('r', r);
                    hs.put('o', o); hs.put('a', a);
                    break;
            }
        }
        return res;
    }
}


// // Runtime: 81 ms, faster than 50.00% of Java online submissions for Minimum Number of Frogs Croaking.
// // Memory Usage: 53.2 MB, less than 100.00% of Java online submissions for Minimum Number of Frogs Croaking.

// class Solution {
//     public int minNumberOfFrogs(String croakOfFrogs) {
//         if (croakOfFrogs.length() % 5 != 0) return -1;
//         Map<Character, Integer> hs = new HashMap<>();
//         hs.put('c', 0);
//         hs.put('r', 0);
//         hs.put('o', 0);
//         hs.put('a', 0);
//         int res = 1;
//         for (char curr : croakOfFrogs.toCharArray()) {
//             if (curr == 'c') {
//                 hs.put('c', hs.get('c')+1);
//             } else if (curr == 'r') {
//                 hs.put('r', hs.get('r')+1);
//                 if (hs.get('r') > hs.get('c')) return -1;
//             } else if (curr == 'o') {
//                 hs.put('o', hs.get('o')+1);
//                 if (hs.get('o') > hs.get('r')) return -1;
//             } else if (curr == 'a') {
//                 hs.put('a', hs.get('a')+1);
//                 if (hs.get('a') > hs.get('o')) return -1;
//             } else {
//                 int c = hs.get('c');
//                 int r = hs.get('r');
//                 int o = hs.get('o');
//                 int a = hs.get('a');
//                 res = Integer.max(res, c--);
//                 res = Integer.max(res, r--);
//                 res = Integer.max(res, o--);
//                 res = Integer.max(res, a--);
//                 if (c < 0 || r < 0 || o < 0 || a < 0) return -1;
//                 hs.put('c', c);
//                 hs.put('r', r);
//                 hs.put('o', o);
//                 hs.put('a', a);
//             }
//         }
//         return res;
//     }
// }