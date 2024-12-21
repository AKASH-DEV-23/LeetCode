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
     boolean isBalance=true;
    private  int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        if(Math.abs(lh-rh)>1){
            isBalance=false;
        }
        return Math.max(lh,rh)+1;
    }
    public  boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
       int h=  height(root);
        return isBalance;
    }
}
