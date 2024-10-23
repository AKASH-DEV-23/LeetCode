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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            int n = q.size();
            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                totalSum += curr.val;
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            list.add(totalSum);
        }

        q.offer(root);
        root.val = 0;
        int n = 1;
        while (!q.isEmpty()) {
            int m = q.size();
            int siblingSum = 0;
            for (int i = 0; i < m; i++) {
                TreeNode curr = q.poll();
                siblingSum = (curr.left != null) ? curr.left.val : 0;
                siblingSum += (curr.right != null) ? curr.right.val : 0;
                if (curr.left != null) {
                    int sum = list.get(n) - siblingSum;
                    curr.left.val = sum;
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    int sum = list.get(n) - siblingSum;
                    curr.right.val = sum;
                    q.offer(curr.right);
                }
            }
            n++;

        }
        return root;
    }
}
