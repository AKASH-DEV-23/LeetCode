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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)   return head;

        ListNode oddIndexHead=head;
        ListNode evenIndexHead=head.next;

        ListNode oddNode=oddIndexHead;
        ListNode evenNode=evenIndexHead;

        ListNode lastNode=oddNode;

        while(evenNode!=null && oddNode!=null){
            oddNode.next=evenNode.next;
            oddNode=oddNode.next;
            if(oddNode!=null)  lastNode=oddNode;
            if(oddNode!=null){
                evenNode.next=oddNode.next;
                evenNode=evenNode.next;
            }
        }

        lastNode.next=evenIndexHead;
        return head;
    }
}
