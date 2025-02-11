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
    class CustomNode{
        TreeNode root;
        int idx;
        public CustomNode(TreeNode root, int idx){
            this.root=root;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<CustomNode> dq=new ArrayDeque<>();
        dq.offer(new CustomNode(root,0));
        int maxDepth=1;
        while(!dq.isEmpty()){
            int n=dq.size();
            int left = dq.peekFirst().idx;
            int right = dq.peekLast().idx;
            maxDepth=Math.max(maxDepth,right-left+1);
            for(int i=0;i<n;i++){
                CustomNode customNode = dq.removeFirst();
                TreeNode curr=customNode.root;
                int idx=customNode.idx;
                if(curr.left!=null){
                    dq.offer(new CustomNode(curr.left,2*idx+1));
                }
                if(curr.right!=null){
                    dq.offer(new CustomNode(curr.right,2*idx+2));
                }
            }
        }
        return maxDepth;
    }
}