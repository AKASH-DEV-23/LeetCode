/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> s1=new Stack<>(); 
        Stack<ListNode> s2=new Stack<>(); 
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            s1.push(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            s2.push(temp2);
            temp2=temp2.next;
        }
        ListNode check=null;
        while(!s1.isEmpty() && !s2.isEmpty()){
            ListNode check1=s1.pop();
            ListNode check2=s2.pop();
            if(check1==check2)  check=check1;
            else    break;
        }
        return check;
    }
}