class Solution {
    public int longestBalanced(int[] nums) {
        int size=nums.length;
        int ans=0;

        for(int i=0;i<size;i++){
            Set<Integer> vis=new HashSet<>();
            int even=0;
            int odd=0;

            for(int j=i;j<size;j++){
                if(nums[j]%2==0 && !vis.contains(nums[j]))  even++;
                else if(!vis.contains(nums[j]))    odd++;
                vis.add(nums[j]);
                if(odd==even)   ans=Math.max(ans,j-i+1);
            }    
        }

        return ans;
    }
}
