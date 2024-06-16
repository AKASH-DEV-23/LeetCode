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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }
        ListNode l = temp.next;
        ListNode prev = null;
        ListNode curr = l;
        for (int i = 1; i <= (right - left + 1); i++) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        temp.next = prev;
        l.next = curr;
        return dummy.next;
    }
}
