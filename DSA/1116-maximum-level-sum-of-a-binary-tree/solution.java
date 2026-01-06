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
    public int maxLevelSum(TreeNode root) {
       if(root==null) return 0;
        Queue<TreeNode> qobj = new LinkedList<>();
        qobj.offer(root);
        int lvl=1;
        int currLvl=1;
        int maxSum=Integer.MIN_VALUE;
        while(!qobj.isEmpty()){
            int size=qobj.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr = qobj.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    qobj.offer(curr.left);
                }
                if(curr.right!=null){
                    qobj.offer(curr.right);
                }
            }
            if(maxSum<sum){
                maxSum=sum;
                lvl=currLvl;
            }
            currLvl++;
        }
        return lvl;
    }
}
