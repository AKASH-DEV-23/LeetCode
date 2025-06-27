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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-111);
        ListNode prev=dummy;
        while(head!=null){
            if(prev.val!=head.val){
                prev.next=new ListNode(head.val);
                prev=prev.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
