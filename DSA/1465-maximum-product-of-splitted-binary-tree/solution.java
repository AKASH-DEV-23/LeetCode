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
    long totalSum;
    long ans=Integer.MIN_VALUE;
    long MOD=1000_000_007;
    public int maxProduct(TreeNode root) {
        totalSum=getTotalSum(root);
        subTreeSum(root);
        return (int)(ans%MOD);
    }
    private long getTotalSum(TreeNode root){
        if(root==null)  return 0;
        return root.val+getTotalSum(root.left)+getTotalSum(root.right);
    }
    private long subTreeSum(TreeNode root){
        if(root==null)  return 0;
        long leftSum=subTreeSum(root.left);
        long rightSum=subTreeSum(root.right);
        long currSum=root.val+leftSum+rightSum;
        ans=Math.max(ans,(totalSum-currSum)*currSum);
        return currSum;
    }
}
