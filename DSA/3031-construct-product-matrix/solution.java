class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD=12345;
        int m=grid.length;
        int n=grid[0].length;
        int size=m*n;
        long[] path=new long[size];
        long[] prefix=new long[size];
        long[] suffix=new long[size];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                path[idx++]=grid[i][j];
            }
        }
        prefix[0]=1;
        suffix[size-1]=1;
        for(int i=1;i<size;i++){
            prefix[i]=(path[i-1]*prefix[i-1])%MOD;
        }
        for(int i=size-2;i>=0;i--){
            suffix[i]=(path[i+1]*suffix[i+1])%MOD;
        }
        idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=(int)((prefix[idx]*suffix[idx++])%MOD);
            }
        }
        return grid;
    }
}
