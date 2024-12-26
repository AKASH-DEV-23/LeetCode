/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int good=0;
    public int goodNodes(TreeNode root) {
        helper(root,root.val);
        return good;
    }
    private void helper(TreeNode root, int num){
        if(root==null){
            return;
        }
        if(root.val>=num){
            good++;
        }
        num=Math.max(num,root.val);
        helper(root.left,num);
        helper(root.right,num);
    }
}
