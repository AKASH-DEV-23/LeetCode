/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode nextNode=head;
        ListNode prev=null;
        while(nextNode!=null){
            nextNode=nextNode.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        head=prev;
        return head;
    }
}
