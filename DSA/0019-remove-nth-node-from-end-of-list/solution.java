/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // always deletion operation create a dummy node.
        // incase of delete head itself it does not create any problem.
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        // maintain prev node and gap to delete node
        for(int i=0;i<n;i++){
            second = second.next;
        }
        while(second.next!=null){
            first=first.next;
            second=second.next;
        }
        // change the prev node address
        first.next=first.next.next;
        return dummy.next;

    }
}
