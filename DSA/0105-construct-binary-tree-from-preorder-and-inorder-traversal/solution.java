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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int[] idx = {0}; // Use an array to keep track of the index
        return solve(preorder, inorder, 0, n - 1, idx);
    }

    public TreeNode solve(int[] preorder, int[] inorder, int start, int end, int[] idx) {
        if (start > end)
            return null;
        int nodeVal = preorder[idx[0]];
        idx[0]++;
        TreeNode root = new TreeNode(nodeVal);
        int i = start;
        for (; i < end; i++) {
            if (inorder[i] == nodeVal) {
                break;
            }
        }
        root.left = solve(preorder, inorder, start, i - 1, idx);
        root.right = solve(preorder, inorder, i + 1, end, idx);

        return root;
    }
}

