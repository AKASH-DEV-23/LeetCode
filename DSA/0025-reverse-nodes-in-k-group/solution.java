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
    
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode pre = dummy;
    ListNode cur = head;

    int count = 0;
    while (cur != null) {
        count++;
        if (count % k == 0) {
            pre = reverse(pre, cur.next);
            cur = pre.next;
        } else {
            cur = cur.next;
        }
    }

    return dummy.next;
}

public ListNode reverse(ListNode pre, ListNode end) {
    ListNode last = pre.next;
    ListNode cur = last.next;

    while (cur != end) {
        last.next = cur.next;
        cur.next = pre.next;
        pre.next = cur;
        cur = last.next;
    }

    return last;
}
}
