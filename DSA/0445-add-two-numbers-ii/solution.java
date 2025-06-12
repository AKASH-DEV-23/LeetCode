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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(l1!=null || l2!=null || carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            temp.next=new ListNode(sum%10);
            carry=sum/10;
            temp=temp.next;
        }
        return reverse(dummy.next);
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null)   return head;
        ListNode newHead=reverse(head.next);
        ListNode temp=head.next;
        temp.next=head;
        head.next=null;
        return newHead;
    }
}
