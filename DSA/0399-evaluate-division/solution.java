class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,List<Pair>> adj=new HashMap<>();
        int idx=0;
        for(List<String> temp:equations){
            String u=temp.get(0);
            String v=temp.get(1);
            double w=values[idx++];
            if(!adj.containsKey(u)) adj.put(u,new ArrayList<>());
            if(!adj.containsKey(v)) adj.put(v,new ArrayList<>());
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,1.0/w));
        }
        double[] ans=new double[queries.size()];
        idx=0;
        for(List<String> temp:queries){
            String u=temp.get(0);
            String v=temp.get(1);
            if(adj.containsKey(u) && adj.containsKey(v)){
                double[] pre={1.0};
                boolean[] found={false};
                DFS(u,v,pre,adj,new HashSet<String>(),found);
                if(found[0])    ans[idx++]=pre[0];
                else    ans[idx++]=-1.0;
            }else   ans[idx++]=-1.0;
        }
        return ans;
    }
    private void DFS(String u, String tar, double[] pre, HashMap<String,List<Pair>> adj, HashSet<String> vis, boolean[] found) {
        if(u.equals(tar)){
            found[0]=true;
            return;
        }
        vis.add(u);
        for(Pair temp:adj.getOrDefault(u,new ArrayList<>())){
            String v=temp.node;
            double w=temp.val;
            if(!vis.contains(v)){
                pre[0]=pre[0]*w;
                vis.add(v);
                DFS(v,tar,pre,adj,vis,found);
                if(found[0])    return;
                pre[0]=pre[0]/w;
            }
        }
    }
}
class Pair{
    String node;
    double val;
    public Pair(String node, double val){
        this.node=node;
        this.val=val;
    }
}
