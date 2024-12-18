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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode newHead=head;
        ListNode dummy=new ListNode(-111);
        ListNode temp=dummy;
        int sum=0;
        int carry=0;
        while(newHead!=null){
            int num=newHead.val;
            num*=2;
            num+=carry;
            carry=num/10;
            int rem=num%10;
            ListNode newNode=new ListNode(rem);
            temp.next=newNode;
            temp=newNode;
            newHead=newHead.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
       return reverse(dummy.next);
    }
    private static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
