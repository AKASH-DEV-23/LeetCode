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
    public boolean equationsPossible(String[] equations) {
        DSU dsu=new DSU(26);
        for(String s:equations){
            if(s.charAt(1)=='='){
                int x=s.charAt(0)-'a';
                int y=s.charAt(3)-'a';
                dsu.union(x,y);
            }
        }
        for(String s:equations){
            if(s.charAt(1)=='!'){
                int x=s.charAt(0)-'a';
                int y=s.charAt(3)-'a';
                if(dsu.isConnected(x,y))    return false;
            }
        }
        return true;
    }
}
