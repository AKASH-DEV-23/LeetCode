class Solution {
    public int bagOfTokensScore(int[] nums, int power) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int max=0;
        int curr=0;

        while(i<=j){
            if(power>=nums[i]){
                curr++;
                power-=nums[i];
                max=Math.max(curr,max);
                i++;
            }else if(curr>=1){
                power+=nums[j];
                curr--;
                j--;
            }else{
                break;
            }
        }
        return max;
    }
}
