class Solution {
    class CustomNode {
        TreeNode node;
        int row;
        int col;
        
        CustomNode(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<CustomNode> queue = new LinkedList<>();
        
        queue.offer(new CustomNode(root, 0, 0));
        
        while (!queue.isEmpty()) {
            CustomNode customNode = queue.poll();
            TreeNode node = customNode.node;
            int row = customNode.row;
            int col = customNode.col;
            
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);
            
            if (node.left != null) {
                queue.offer(new CustomNode(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                queue.offer(new CustomNode(node.right, row + 1, col + 1));
            }
        }
        
        for (TreeMap<Integer, PriorityQueue<Integer>> colMap : map.values()) {
            List<Integer> columnNodes = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : colMap.values()) {
                while (!nodes.isEmpty()) {
                    columnNodes.add(nodes.poll());
                }
            }
            result.add(columnNodes);
        }
        
        return result;
    }
}
