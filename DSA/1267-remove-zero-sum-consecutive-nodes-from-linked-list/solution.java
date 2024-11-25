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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int prefixSum=0;
        map.put(0,dummy);
        while(head!=null){
            prefixSum += head.val;
            if(map.containsKey(prefixSum)){
                int preSum=prefixSum;
                ListNode start=map.get(preSum);
                ListNode temp=start;
                while(temp!=head){
                    temp=temp.next;
                    preSum+=temp.val;
                    if(temp!=head){
                        map.remove(preSum);
                    }
                }
                start.next=head.next;
            } else{
                map.put(prefixSum,head);
            }
            head=head.next;
        }
        return dummy.next;
    }
}
