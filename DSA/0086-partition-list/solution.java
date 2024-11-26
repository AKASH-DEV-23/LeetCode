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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode big=new ListNode(1);
        ListNode temp1=small;
        ListNode temp2=big;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                temp1.next=new ListNode(curr.val);
                temp1=temp1.next;
            }else{
                temp2.next=new ListNode(curr.val);
                temp2=temp2.next;
            }
            curr=curr.next;
        }
        temp1.next=big.next;
        return small.next;
    }
}
