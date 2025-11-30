class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        for(int num:nums){
            sum=(sum+num)%p;
        }
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int ans=n;
        int curr=0;
        int target=sum%p;
        if(target==0)   return 0;
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            curr=(curr+nums[i])%p;
            int prev=(curr-target+p)%p;
            if(mp.containsKey(prev)){
                ans=Math.min(ans,i-mp.get(prev));
            }
            mp.put(curr,i);
        }
        return ans==n?-1:ans;
    }
}
