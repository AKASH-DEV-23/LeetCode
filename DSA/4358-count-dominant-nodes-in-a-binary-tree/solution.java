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
    private int cnt;
    public int countDominantNodes(TreeNode root) {
        cnt=0;
        maxNode(root);
        return cnt;
    }

    private int maxNode(TreeNode root){
        if(root==null)  return -1;
        int left=maxNode(root.left);
        int right=maxNode(root.right);
        if(root.val>=left && root.val>=right)  cnt++;
        return Math.max(root.val,Math.max(left,right));
    }
}
