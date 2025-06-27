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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=head;
        ListNode dummy1=dummy;
        while(temp!=null){
            dummy1.next=new ListNode(temp.val);
            temp=temp.next;
            dummy1=dummy1.next;
        }
        dummy=dummy.next;
        head=reverse(head);
        while(dummy!=null && head!=null){
            if(dummy.val!=head.val) return false;
            dummy=dummy.next;
            head=head.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null)   return head;
        ListNode ans=reverse(head.next);
        ListNode temp=head.next;
        temp.next=head;
        head.next=null;
        return ans; 
    }
}
