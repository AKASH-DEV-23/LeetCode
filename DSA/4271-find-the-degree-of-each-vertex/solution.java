class Solution {
    public int[] findDegrees(int[][] matrix) {
        int len=matrix.length;
        int[] ans=new int[len];

        int idx=0;
        for(int[] temp:matrix){
            int cnt=0;
            for(int num:temp){
                if(num==1)  cnt++;
            }
            ans[idx++]=cnt;
        }
        return ans;
    }
}
