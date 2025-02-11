class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max= nums[n-1];
        int ans=max;
        if(n<3) return max;
        int cnt=0;
        for(int i=n-2;i>=0;i--){
            if(max==nums[i]){
                continue;
            }
            max=nums[i];
            cnt++;
            if(cnt==2)  break;
        }
        return cnt==2 ? max:ans  ;
    }
}