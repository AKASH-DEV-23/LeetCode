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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null)  return root;
        int leftH=getHeight(root.left);
        int rightH=getHeight(root.right);
        if(leftH==rightH)    return root;
        if(leftH>rightH)    return subtreeWithAllDeepest(root.left);
        else    return subtreeWithAllDeepest(root.right);
    }

    private int getHeight(TreeNode root){
        if(root==null)  return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}
