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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int l = 0;
        int r = list.size() - 1;
        return balance(l, r, list);
    }

    private void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    private TreeNode balance(int l, int r, ArrayList<Integer> list) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = balance(l, mid - 1, list);
        root.right = balance(mid + 1, r, list);
        return root;
    }
}
