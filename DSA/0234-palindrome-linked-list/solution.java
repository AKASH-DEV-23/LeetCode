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

        if(head==null || head.next==null)   return true;
        
        ListNode startNode=head;

        ListNode middleNode=findMiddleNode(head);

        ditachList(head,middleNode);

        ListNode lastNode=reverseList(middleNode);


        while(startNode !=null && lastNode!=null){
            if(startNode.val!=lastNode.val)   return false;
            startNode=startNode.next;
            lastNode=lastNode.next;
        }

        return true;
    }

    private ListNode findMiddleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode head){
        if(head==null || head.next==null)   return head;

        ListNode lastNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;

        return lastNode;
    }

    private void ditachList(ListNode head, ListNode middleNode){
        ListNode startNode=head;
        while(startNode.next!=middleNode){
            startNode=startNode.next;
        }
        startNode.next=null;
    }
}
