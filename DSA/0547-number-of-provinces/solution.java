class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        DSU dsu=new DSU(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1)
                    dsu.union(i,j);
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(dsu.find(i));
        }
        return set.size();
    }
}
class DSU{
    int[] parent;
    int[] size;

    public DSU(int n){
        parent=new int[n];
        size=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
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
        if(size[xParent]>size[yParent])     parent[yParent]=xParent;
        else if(size[yParent]>size[xParent])    parent[xParent]=yParent;
        else{
            parent[yParent]=xParent;
            size[xParent]++;
        }
    }
}
