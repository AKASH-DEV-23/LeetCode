class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] dp=new int[n];
        int[] preIdx=new int[n];
        int lastIdx=0;
        int maxLen=1;
        Arrays.fill(dp,1);
        Arrays.fill(preIdx,-1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[j]+1 > dp[i]){
                        dp[i]=dp[j]+1;
                        preIdx[i]=j;
                    }
                }
            }
            if(maxLen<dp[i]){
                maxLen=dp[i];
                lastIdx=i;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(lastIdx!=-1){
            ans.add(nums[lastIdx]);
            lastIdx=preIdx[lastIdx];
        }
        Collections.reverse(ans);
        return ans;
    }
}
