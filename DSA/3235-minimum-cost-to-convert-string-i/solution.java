class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
       long[][] grid = adjMatrix(original,changed, cost);
       floyd(grid);

       long ans=0;
       for(int i=0;i<source.length();i++){
            int u=source.charAt(i)-'a';
            int v=target.charAt(i)-'a';
            if(u!=v){
                if(grid[u][v]!=Long.MAX_VALUE){
                    ans+=grid[u][v];
                }else{
                    return -1;
                }
            }
       }

       return ans;
    }

    private long[][] floyd(long[][] grid){
        for(int via=0;via<26;via++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(grid[i][via] != Long.MAX_VALUE && grid[via][j] != Long.MAX_VALUE){
                        grid[i][j]=Math.min(grid[i][j],grid[i][via]+grid[via][j]);
                    }
                }
            }
        }
        return grid;
    }

    private long[][] adjMatrix(char[] original, char[] changed, int[] cost){
        long[][] mat=new long[26][26];
        for(long[] temp:mat) Arrays.fill(temp,Long.MAX_VALUE);

        for(int i=0;i<cost.length;i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            int w=cost[i];
            mat[u][v]=Math.min(mat[u][v],w);
        }

        for(int i=0;i<26;i++){
            mat[i][i]=0;
        }

        return mat;

    }
}
