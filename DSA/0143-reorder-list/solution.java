/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // if LL has 1 or 2 node simply return
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        // find middle of the LL
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Break the LL and reverse the second half
        ListNode newHead = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = newHead;
        ListNode nextnode = newHead;
        while (nextnode != null) {
            nextnode = nextnode.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        // merge both LL
        ListNode t1 = head;
        ListNode t2 = prev;
        while (t2 != null) {
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;
            t1.next = t2;
            t2.next = m1;
            t1 = m1;
            t2 = m2;

        }
    }
}
