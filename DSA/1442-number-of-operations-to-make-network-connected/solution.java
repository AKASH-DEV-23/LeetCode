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
        if(rank[xParent]>rank[yParent]){
            parent[yParent]=xParent;
        }else if(rank[xParent]<rank[yParent]){
            parent[xParent]=yParent;
        }else{
            parent[yParent]=xParent;
            rank[xParent]++;
        }
    }

    public boolean isConnected(int x, int y){
        return find(x)==find(y);
    }
}

class Solution {
    public int makeConnected(int n, int[][] connections) {
        int edges=connections.length;
        if(edges<n-1)   return -1;
        DSU dsu=new DSU(n);
        int cnt=0;
        for(int[] conn:connections){
            int u=conn[0];
            int v=conn[1];
            if(!dsu.isConnected(u,v))    dsu.union(u,v);
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(dsu.find(i));
        }
        return set.size()-1;
    }
}
