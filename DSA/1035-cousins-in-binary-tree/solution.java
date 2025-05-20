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
class Pair{
    TreeNode parent;
    TreeNode child;
    public Pair(TreeNode parent, TreeNode child){
        this.parent=parent;
        this.child=child;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,root));
        while(!q.isEmpty()){
            int n=q.size();
            int xParent=0;
            int yParent=0;
            int cnt=0;
            for(int i=0;i<n;i++){
                Pair p=q.poll();
                TreeNode parent=p.parent;
                TreeNode child=p.child;
                if(x==child.val){
                   xParent=parent.val;
                    cnt++;
                }
                if(y==child.val){
                    yParent=parent.val;
                    cnt++;
                }
                if(cnt ==2 && xParent!=yParent)    return true;
                if(child.left!=null)   q.offer(new Pair(child,child.left));
                if(child.right!=null)  q.offer(new Pair(child,child.right));
            } 
        }
        return false;
    }
}
