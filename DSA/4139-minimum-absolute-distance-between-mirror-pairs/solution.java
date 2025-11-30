class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Set<Integer> vis=new HashSet<>();
        for(int num:nums)  vis.add(num);
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder(nums[i]+"");
            sb.reverse();
            int rev=Integer.parseInt(sb.toString());
            if(vis.contains(rev)){
                int st=i+1;
                while(st<n){
                    if(nums[st]==rev){
                        ans=Math.min(ans,st-i);
                        break;
                    }
                    st++;
                }
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}
