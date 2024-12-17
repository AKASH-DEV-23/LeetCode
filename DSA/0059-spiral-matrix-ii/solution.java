class Solution {
    public int[][] generateMatrix(int n) {
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;
        int[][] ans=new int[n][n];
        int cnt=1;
        while(cnt<=n*n){
           for(int i=rowStart;i<=colEnd;i++){
            ans[rowStart][i]=cnt;
            cnt++;
           }
            rowStart++;
           for(int i=rowStart;i<=rowEnd;i++){
            ans[i][colEnd]=cnt;
            cnt++;
           }
           colEnd--;
           if(rowStart<=rowEnd){
           for(int i=colEnd;i>=colStart;i--){
            ans[rowEnd][i]=cnt;
            cnt++;
           }
           rowEnd--;
           }
           if(colStart<=colEnd){
           for(int i=rowEnd;i>=rowStart;i--){
            ans[i][colStart]=cnt;
            cnt++;
           }
           colStart++;
           }
        }
        return ans;
    }
}
