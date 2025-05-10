/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return preOrder(cloned,target.val);
    }
    private TreeNode preOrder(TreeNode root, int target){
        if(root==null)  return null;
        if(root.val==target)    return root;
        TreeNode left=preOrder(root.left, target);
        if(left!=null)  return left;
        return preOrder(root.right, target);
    }
}