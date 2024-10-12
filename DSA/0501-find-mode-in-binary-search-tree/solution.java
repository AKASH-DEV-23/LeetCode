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
    int currNum = 0;
    int currFreq = 0;
    int maxFreq = 0;
    List<Integer> list = new ArrayList<>();

    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (root.val == currNum) {
            currFreq++;
        } else {
            currNum = root.val;
            currFreq = 1;
        }
        if (currFreq > maxFreq) {
            list.clear();
            maxFreq = currFreq;
        }
        if (currFreq == maxFreq) {
            list.add(root.val);
        }
        inorder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inorder(root);
        int result[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
