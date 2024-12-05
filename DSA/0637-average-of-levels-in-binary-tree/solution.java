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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        q.offer(root);
        double sum=0;
        list.add((double)root.val);
        while(!q.isEmpty()){
            int n=q.size();
            int cnt=0;
            for(int i=1;i<=n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    sum+=temp.left.val;
                    q.offer(temp.left);
                    cnt++;
                }
                if(temp.right!=null){
                    sum+=temp.right.val;
                    q.offer(temp.right);
                    cnt++;
                }
            }
            if(sum!=0 || cnt>0){
                sum/=cnt;
                list.add(sum);
            }
            sum=0;
        }
        return list;
    }
}
