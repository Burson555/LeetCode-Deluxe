// Runtime: 14 ms, faster than 54.50% of Java online submissions for Linked List Random Node.
// Memory Usage: 50.2 MB, less than 6.67% of Java online submissions for Linked List Random Node.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.Random;
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    ListNode head;
    Random r;
    public Solution(ListNode head) {
        this.head = head;
        r = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode iter = head;
        int temp_val = iter.val;
        int count = 1;
        while (iter.next != null) {
            iter = iter.next;
            temp_val = (r.nextInt(++count) == 0) ? iter.val : temp_val;
        }
        return temp_val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */