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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Long> list = new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            list.add(sum);
        }
        if (k > list.size())
            return -1;
        list.sort(Collections.reverseOrder());
        return list.get(k - 1);
    }
}
