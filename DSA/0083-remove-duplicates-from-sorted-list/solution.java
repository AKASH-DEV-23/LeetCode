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
        ListNode dummy=new ListNode(-11111);
        dummy.next=head;
        ListNode fast=head;
        ListNode slow=dummy;
        while(fast!=null && fast !=null){
            while(fast !=null && fast.val==slow.val){
                fast=fast.next;
            }
            slow.next=fast;
            slow=fast;
        }
        if(fast !=null && fast.val==slow.val){
            slow.next=fast.next;
        }
        return dummy.next;
    }
}
