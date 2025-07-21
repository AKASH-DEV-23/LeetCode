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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        find(root,temp,targetSum,ans);
        return ans;

    }
    private void find(TreeNode root, List<Integer> temp, int target, List<List<Integer>> ans){
        if(root==null)  return;
        temp.add(root.val);
        if(root.left==null && root.right==null && target==root.val) ans.add(new ArrayList<>(temp));
        find(root.left,temp,target-root.val,ans);
        find(root.right,temp,target-root.val, ans);
        temp.remove(temp.size()-1);
    }
}
