class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int total = 0, num = target.length;
        for (int i = 0; i < num; i++){
            pq.add(target[i]);
            total += target[i];
        }
        while (!pq.isEmpty() && pq.peek() != 1) {
            int curr = pq.poll();
            int res = total - curr;
            int last = curr - res;
            total = res + last;
            pq.offer(last);
        }
        while (!pq.isEmpty())
            if (pq.poll() != 1)
                return false;
        return true;
    }
}



// class Solution {
//     public boolean isPossible(int[] target) {
//         while (true) {
//             if (this.check(target) == 1) {
//                 return true;
//             } else if (this.check(target) == -1) {
//                 return false;
//             } else {
//                 int maxi = 0, count = 0;
//                 for (int i = 0; i < target.length; i++)
//                     if (target[i] > target[maxi])
//                         maxi = i;
//                 for (int i = 0; i < target.length; i++)
//                     if (i != maxi)
//                         count += target[i];
//                 target[maxi] = target[maxi] - count;
//             }
//         }
//     }
    
//     private int check(int[] target) {
//         int num = target.length, count = 0;
//         for (int i = 0; i < num; i++) {
//             if (target[i] == 1)
//                 count++;
//             else if (target[i] <= 0)
//                 return -1;
//         }
//         return (count == num) ? 1 : 0;
//     }
// }