class Solution {
    final static int MOD=(int)1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] temp:queries){
            int st=temp[0];
            int end=temp[1];
            int sp=temp[2];
            int ml=temp[3];
            for(int i=st;i<=end;i+=sp){
                long sum=(long)nums[i]*ml;
                nums[i]=(int)(sum%MOD);
            }
        }
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}
