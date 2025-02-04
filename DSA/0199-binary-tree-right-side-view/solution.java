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
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)  return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode  curr=q.poll();
                if(i==0)    list.add(curr.val);
                if(curr.right!=null)    q.offer(curr.right);
                if(curr.left!=null) q.offer(curr.left);
            }
        }
        return list;
    }
}
