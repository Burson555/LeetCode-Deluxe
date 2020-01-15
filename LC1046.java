// Runtime: 1 ms, faster than 93.05% of Java online submissions for Last Stone Weight.
// Memory Usage: 35 MB, less than 100.00% of Java online submissions for Last Stone Weight.
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int item : stones) queue.add(item);
        while (queue.size()>1){
            int i1 = queue.poll();
            int i2 = queue.poll();
            if (i1!=i2) queue.add(i1-i2);
        }
        return queue.isEmpty() ? 0: queue.poll();
    }
}


// Runtime: 2 ms, faster than 43.86% of Java online submissions for Last Stone Weight.
// Memory Usage: 34.9 MB, less than 100.00% of Java online submissions for Last Stone Weight.
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b-a));
        for (int stone: stones)
            pq.offer(stone);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }
}


// Runtime: 7 ms, faster than 5.06% of Java online submissions for Last Stone Weight.
// Memory Usage: 35.2 MB, less than 100.00% of Java online submissions for Last Stone Weight.

// ############################ MY SOLUTION: QUICK SORT APPLIED
import java.util.Random;

class Solution {
    public int lastStoneWeight(int[] stones) {
        this.myRQS(stones, 0, stones.length-1);
        for (int u = 0; u < stones.length; u++)
            System.out.println(stones[u]);
        for (int head = 0; head < stones.length-1; head++) {
            stones[head+1] = stones[head] - stones[head+1];
            if (stones[head+1] == 0)
                head++;
            else
                this.adjust(stones, head+1);
        }
        return stones[stones.length-1];
    }
    
    private void adjust(int[] stones, int head) {
        if (head == stones.length-1)
            return;
        while (head < stones.length-1 && stones[head] < stones[head+1]){
            this.swap(stones, head, head+1);
            head++;
        }
    }
    
    private void myRQS(int[] stones, int low, int high) {
        if (low >= high)
            return;
        Random r = new Random();
        int pivot = r.nextInt(high - low + 1) + low;
        this.swap(stones, high, pivot);
        int k = this.partition(stones, low, high);
        this.myRQS(stones, low, k-1);
        this.myRQS(stones, k+1, high);
    }
    
    private int partition(int[] stones, int low, int high) {
        int i = low;
        for (int j = low; j < high; j++){
            if (stones[j] > stones[high])
                this.swap(stones, j, i++);
        }
        this.swap(stones, i, high);
        return i;
    }
    
    private void swap(int[] stones, int a, int b) {
        int temp = stones[a];
        stones[a] = stones[b];
        stones[b] = temp;
    }
}