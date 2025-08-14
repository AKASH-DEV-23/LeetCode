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
    List<Integer> lst;
    public int findSecondMinimumValue(TreeNode root) {
        lst=new ArrayList<>();
        inorder(root);
        Set<Integer> vis=new HashSet<>();
        for(int num:lst)    vis.add(num);
        lst.clear();
        for(int num:vis)    lst.add(num);
        Collections.sort(lst);
        return lst.size()>=2 ? lst.get(1) : -1;
    }
    private void inorder(TreeNode root){
        if(root==null)  return;
        inorder(root.left);
        lst.add(root.val);
        inorder(root.right);
    }
}