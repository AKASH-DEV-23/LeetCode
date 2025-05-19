class DSU{
    private int[] parent;
    private int[] rank;

    public DSU(int n){
        parent=new int[n];
        rank=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }
    }

    public int find(int x){
        if(x==parent[x])    return x;
        return parent[x]=find(parent[x]);
    }

    public void union(int x, int y){
        int xParent=find(x);
        int yParent=find(y);
        if(xParent==yParent)    return;
        if(rank[xParent]>rank[yParent])     parent[yParent]=xParent;
        else if(rank[xParent]<rank[yParent])    parent[xParent]=yParent;
        else{
            parent[yParent]=xParent;
            rank[xParent]++;
        }
    }
}
class Solution {
    public long countPairs(int n, int[][] edges) {
        DSU dsu=new DSU(n);
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            dsu.union(u,v);
        }
        Map<Integer, Integer> map=new HashMap<>(); 
        for(int i=0;i<n;i++){
            int papa=dsu.find(i);
            map.put(papa,map.getOrDefault(papa,0)+1);
        }
        long ans=0;
        for(int key:map.keySet()){
            long size=map.get(key);
            ans+=size*(n-=size);
        }
        return ans;
    }
}