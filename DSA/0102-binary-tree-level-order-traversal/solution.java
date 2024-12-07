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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> list1=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                list1.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }

            }
            System.out.print(list1);
            list.add(list1);
        }
        return list;
    }
}
