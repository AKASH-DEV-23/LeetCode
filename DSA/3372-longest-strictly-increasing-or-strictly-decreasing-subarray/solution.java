class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0)  return 0;
        int maxCnt=1;
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])   cnt++;
            else    cnt=1;
            maxCnt=Math.max(maxCnt,cnt);
        }
        cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])   cnt++;
            else    cnt=1;
            maxCnt=Math.max(maxCnt,cnt);
        }

        return maxCnt;
    }
}
