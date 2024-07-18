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
    private ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val <= l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l2.next, l1);
            return l2;
        }
    }

    private ListNode partitionAndMerge(ListNode[] lists, int start, int end) {
        // if(start> end){
        //     return null;
        // }
        if (start == end) {
            return lists[start];
        }
        while(start< end){
            int mid = (start + end) / 2;
            ListNode L1 = partitionAndMerge(lists, start, mid);
            ListNode L2 = partitionAndMerge(lists, mid + 1, end);
            return mergeTwoList(L1, L2);
        }
        return null;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return partitionAndMerge(lists, 0, lists.length - 1);
    }
}
