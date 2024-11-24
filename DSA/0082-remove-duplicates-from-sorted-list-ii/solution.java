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
        ListNode dummy=new ListNode(-1111);
        dummy.next=head;
        ListNode temp=head;
        ListNode prev=dummy;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                int value=temp.val;
                while(temp!=null && temp.val==value){
                    temp=temp.next;
                }
                prev.next=temp;
            } else{
                temp=temp.next;
                prev=prev.next;
            }
        }
        return dummy.next;
    }
}
