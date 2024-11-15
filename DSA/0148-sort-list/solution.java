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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        
        Collections.sort(list);
        ListNode dummy = new ListNode(1000000);
        dummy.next=head;
        ListNode temp1=head;
        for (int i = 0; i < list.size(); i++) {
            temp1.val = list.get(i);
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}
