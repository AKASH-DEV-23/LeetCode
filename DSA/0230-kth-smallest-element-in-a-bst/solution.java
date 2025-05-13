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
    int cnt=0;
    int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        cnt=k;
        inOrder(root);
        return res;
        // return inorder(root,new int[]{k});
    }
    private void inOrder(TreeNode root){
        if(root==null)  return;
        inOrder(root.left);
        cnt--;
        if(cnt==0){
            res=root.val;
            return;
        }
        inOrder(root.right);
    }
    private int inorder(TreeNode root, int[] nums){
        if(root==null)  return -1;
        int left=inorder(root.left,nums);
        if(left!=-1)    return left;
        nums[0]--;
        if(nums[0]==0)    return root.val;
        return   inorder(root.right,nums);
    }
}
