/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)  return node;
        HashMap<Node,Node> mp=new HashMap<>();
        return solve(node,mp);
    }
    private Node solve(Node node, HashMap<Node,Node> mp){
        Node newNode=new Node(node.val);
        mp.put(node,newNode);
        for(Node neigh:node.neighbors){
            if(!mp.containsKey(neigh)){
                newNode.neighbors.add(solve(neigh,mp));
            }else{
                newNode.neighbors.add(mp.get(neigh));
            }
        }
        return newNode;
    }
}
