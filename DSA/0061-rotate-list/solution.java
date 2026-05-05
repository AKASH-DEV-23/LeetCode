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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        int len=0;
        ListNode temp=head;
        ListNode tail=head;
        while(temp!=null){
            if(temp.next==null){
                tail=temp;
            }
            len++;
            temp=temp.next;
        }
        k=k%len;
        k=len-k;
        ListNode current=head;
        for(int i=1;i<k;i++){
            current=current.next;
        }
        
        tail.next=head;
        ListNode and =current.next;
        current.next=null;
        return and;
    }
}
