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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        int sum=0;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }else{
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
