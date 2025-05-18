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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return search(root,val);
    }
    private TreeNode search(TreeNode root, int val){
        if(root==null)  return new TreeNode(val);
        if(val<root.val){
            TreeNode l=search(root.left,val);
            root.left=l;
            return root;
        }
        else if(val>root.val){
            TreeNode r= search(root.right,val);
            root.right=r;
            return root;
        }
        return root;
    }
}
