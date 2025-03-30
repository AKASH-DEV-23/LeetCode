class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int maxReach=0;
        int currReach=0;
        int jump=0;
        for(int i=0;i<n-1;i++){
            if(i+nums[i]>maxReach){
                maxReach=i+nums[i];
            }
            if(i==currReach){
                jump++;
                currReach=maxReach;
            }
        }
        return jump;
    }
}