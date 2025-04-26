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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list=new ArrayList<>();
        if(root==null)  return list;
        Set<Integer> set=new HashSet<>();
        for(int num:to_delete)  set.add(num);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
                if(set.contains(curr.left.val)){
                    curr.left=null;
                }
            }
            if(curr.right!=null){
                q.offer(curr.right);
                if(set.contains(curr.right.val)){
                    curr.right=null;
                }
            }
            if(set.contains(curr.val)){
                if(curr.left!=null){
                    list.add(curr.left);
                }
                if(curr.right!=null){
                    list.add(curr.right);
                }
            }else if(list.isEmpty()){
                list.add(curr);
            }
        }
        return list;
    }
}