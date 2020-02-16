// Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
// Memory Usage: 45.9 MB, less than 5.00% of Java online submissions for Odd Even Linked List.

// This tells us if we see some if statements within the loop,
//      whose condition contains variables used in the loop header,
//      normally we can simplify it.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        } // loop stops when even.next == null, since odd.next != null always holds
        odd.next = even_head;       
        return head;
    }
}


// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
// // Memory Usage: 41.2 MB, less than 5.00% of Java online submissions for Odd Even Linked List.

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         ListNode dmo = new ListNode(0);
//         ListNode dme = new ListNode(0);
//         ListNode temp = dme;
//         dmo.next = head;
//         while (head != null && head.next != null) {
//             temp.next = head.next;
//             temp = temp.next;
//             head.next = temp.next;
//             temp.next = null;
//             if (head.next != null)
//                 head = head.next;
//             else break;
//         }
//         if (head != null) head.next = dme.next;
//         return dmo.next;
//     }
// }


// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if (head == null)
//             return null;
//         ListNode onode = head;
//         ListNode enode = head.next;
//         ListNode ehead = head.next;
//         while (onode != null && enode != null) {
//             onode.next = enode.next;
//             if (onode.next != null) {
//                 onode = onode.next;
//                 enode.next = onode.next;
//                 enode = enode.next;
//             } else {
//                 onode.next = ehead;
//                 onode = null;
//             }
//         }
//         if (enode == null)
//             onode.next = ehead;        
//         return head;
//     }
// }