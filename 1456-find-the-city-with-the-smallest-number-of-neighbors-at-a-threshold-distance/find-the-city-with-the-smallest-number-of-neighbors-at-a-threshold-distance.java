class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist=new int[n][n];
        for(int[] temp:dist)    Arrays.fill(temp,Integer.MAX_VALUE);
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            dist[u][v]=w;
            dist[v][u]=w;
        }
        for(int i=0;i<n;i++)    dist[i][i]=0;
        for(int via=0;via<n;via++){
            for(int u=0;u<n;u++){
                for(int v=0;v<n;v++){
                    if(u!=v && dist[u][via]!=Integer.MAX_VALUE && dist[via][v]!=Integer.MAX_VALUE){
                        if(dist[u][v]>dist[u][via]+dist[via][v]){
                            dist[u][v]=dist[u][via]+dist[via][v];
                        }
                    }
                }
            }
        }
        int idx=0;
        int[] ways=new int[n];
        for(int[] temp:dist){
            int cnt=0;
            for(int cost:temp)  if(cost<=distanceThreshold) cnt++;
            ways[idx++]=cnt-1;
        }
        int mini=Integer.MAX_VALUE;
        int ans=0;
        System.out.println(Arrays.toString(ways));
        for(int i=0;i<n;i++){
            if(ways[i]<=mini){
                mini=ways[i];
                ans=i;
            }
        }
        return ans;
    }
}