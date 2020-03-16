// Runtime: 110 ms, faster than 73.35% of Java online submissions for Time Needed to Inform All Employees.
// Memory Usage: 64.2 MB, less than 100.00% of Java online submissions for Time Needed to Inform All Employees.

class Solution {
    
    //a bottom-up approach is needed for this question
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            if (!hm.containsKey(manager[i]))
                hm.put(manager[i], new LinkedList<>());
            hm.get(manager[i]).add(i);
        }
        return calculate(headID, informTime, hm);
    }
    
    private int calculate(int currID, int[] informTime, HashMap<Integer, List<Integer>> hm) {
        if (!hm.containsKey(currID)) return 0;
        int max_time = 0;
        for (int i : hm.get(currID))
            max_time = Integer.max(max_time, calculate(i, informTime, hm));
        return informTime[currID] + max_time;
    }
    
}

// For the solution above, though we can possibly make complex nested recursive calls,
// seemingly to have huge work load,
// every step of it is useful.
// However, for the solution below, we have a lot of wasted operations.
// For example, we go through the whole manager array in each while loop.
// That is not necessary.

// // 36 / 39 test cases passed.
// // Status: Time Limit Exceeded

// class Solution {
//     public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
//         int res[] = new int[n];
//         res[headID] = 0;
//         HashSet<Integer> hs = new HashSet<>();
//         hs.add(headID);
//         while (!hs.isEmpty()) {
//             HashSet<Integer> nhs = new HashSet<>();
//             for (int i = 0; i < n; i++) {
//                 if (hs.contains(manager[i])) {
//                     res[i] = res[manager[i]] + informTime[manager[i]];
//                     nhs.add(i);
//                 }
//             }
//             hs = nhs;            
//         }
//         int max = res[0];
//         for (int i : res)
//             max = (i > max) ? i : max;
//         return max;
//     }
// }