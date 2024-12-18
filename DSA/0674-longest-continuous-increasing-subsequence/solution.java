class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxCnt=1;
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cnt++;
            }else{
                maxCnt=Math.max(maxCnt,cnt);
                cnt=1;
            }
        }
        return Math.max(maxCnt,cnt);
    }
}
