/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private TreeNode prev;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        prev = null;
        inorder(root);
        return min;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null) {
            int diff = root.val - prev.val;
            min = Math.min(min, diff);
        }
        prev = root;
        inorder(root.right);
    }
}

