class DSU{
    private int[] parent;
    private int[] rank;

    public DSU(int size){
        parent=new int[size];
        rank=new int[size];

        for(int i=0;i<size;i++){
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

    public boolean isConnected(int x, int y){
        return find(x)==find(y);
    }
 }

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int V=edges.length;
        DSU dsu=new DSU(V+1);
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(dsu.isConnected(u,v))    return edge;
            dsu.union(u,v);
        }
        return new int[]{};
    }
}
