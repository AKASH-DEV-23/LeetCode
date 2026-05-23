class Solution {
    public boolean check(int[] nums) {
        int len=nums.length;
        int cnt=0;
        for(int i=1;i<=nums.length;i++){
            if(nums[(i-1)%len]>nums[i%len]) cnt++;
        }
        return cnt>1?false:true;
    }
}
