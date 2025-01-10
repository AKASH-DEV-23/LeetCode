class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int cnt=0;

        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                cnt++;
            }
        }
        if(nums[0]<nums[n-1])   cnt++;

        return cnt>1?false:true;
    }
}
