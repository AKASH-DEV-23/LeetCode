class Solution {
    public long maxProduct(int[] nums) {
        int max=0;
        for(int temp:nums)  max=Math.max(max,temp);
        int cnt=0;
        int temp=max;
        while(temp>0){
            temp/=2;
            cnt++;
        }
        cnt=Math.max(1,cnt);
        int stemp=1;
        for(int i=0;i<cnt;i++)  stemp*=2;
        int ftmp=stemp-1;
        int[] dp=new int[stemp];
        for(int i=0;i<stemp;i++)  dp[i]=-1;
        for(int x:nums)  dp[x]=Math.max(dp[x],x);
        for(int i=0;i<cnt;i++){
            int b=(int)Math.pow(2,i);
            for(int j=0;j<stemp;j++){
                if((j&b)!=0){
                    dp[j]=Math.max(dp[j],dp[j^b]);
                }
            }
        }
        long ans=0;
        for(int num:nums){
            int tmp=dp[ftmp^num];
            if(tmp!=-1)  ans=Math.max(ans,(long)num*tmp);
        }
        return ans;
    }
}
