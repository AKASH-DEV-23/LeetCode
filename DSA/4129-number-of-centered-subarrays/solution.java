class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            Set<Integer> vis=new HashSet<>();
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                vis.add(nums[j]);
                if(vis.contains((int)sum)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
