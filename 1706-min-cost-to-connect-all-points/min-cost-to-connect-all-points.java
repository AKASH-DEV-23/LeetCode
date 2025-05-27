class Solution {
    public int minCostConnectPoints(int[][] points) {
        Map<Integer,List<int[]>> map=new HashMap<>();
        List<int[]> list=new ArrayList<>();
        int V=points.length;
        for(int i=0;i<V;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=i+1;j<V;j++){
                int w = Math.abs(points[i][0]-points[j][0]) + 
                        Math.abs(points[i][1] - points[j][1]);
                map.get(i).add(new int[]{j,w});
                map.get(j).add(new int[]{i,w});
                list.add(new int[]{i,j,w});
            }
        }
        // return Prims(map,V);
        return Kruskal(list,V);
    }

    private int Kruskal(List<int[]> map, int V){
        DSU dsu=new DSU(V);
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[2]<b[2])   return -1;
                else if(a[2]>b[2])  return 1;
                else return 0;
            }
        };
        PriorityQueue<int[]> pq=new PriorityQueue<>(com);
        for(int[] graph:map){
            pq.offer(graph);
        }
        int cost=0;
        while(!pq.isEmpty()){
            int[] edge=pq.poll();
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if(dsu.isConnected(u,v))    continue;
            cost+=w;
            dsu.union(u,v);
        }
        return cost;
    }

    
    private int Prims(Map<Integer,List<int[]>> map, int V){
        boolean[] visited=new boolean[V];
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[1]<b[1])   return -1;
                else if(a[1]>b[1])  return 1;
                else return 0;
            }
        };
        PriorityQueue<int[]> pq=new PriorityQueue<>(com);
        pq.offer(new int[]{0,0});
        int cost=0;
        int cnt=0;
        while(!pq.isEmpty() && cnt<V){
            int[] edge=pq.poll();
            int u=edge[0];
            int w=edge[1];
            if(visited[u])  continue;
            cost+=w;
            cnt++;
            visited[u]=true;
            for(int[] graph:map.get(u)){
                if(!visited[graph[0]]){
                    pq.offer(graph);
                }
            }
        }
        return cost;
    }
}

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
        if(parent[x]==x)    return x;
        return parent[x]=find(parent[x]);
    }

    public void union(int x, int y){
        int xParent=find(x);
        int yParent=find(y);
        if(xParent==yParent)    return;
        if(rank[xParent] > rank[yParent])   parent[yParent]=xParent;
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