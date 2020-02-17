// Runtime: 49 ms, faster than 100.00% of Java online submissions for Maximum Number of Events That Can Be Attended.
// Memory Usage: 70.6 MB, less than 100.00% of Java online submissions for Maximum Number of Events That Can Be Attended.
// Runtime: 48 ms, faster than 100.00% of Java online submissions for Maximum Number of Events That Can Be Attended.
// Memory Usage: 70.5 MB, less than 100.00% of Java online submissions for Maximum Number of Events That Can Be Attended.

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0, i = 0, num_events = events.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int day = 1; day <= 100000; day++) {
            while (i < num_events && events[i][0] == day)
                pq.offer(events[i++][1]);
            while (!pq.isEmpty() && pq.peek() < day)
                pq.poll();
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
        }
        return res;
    }
}