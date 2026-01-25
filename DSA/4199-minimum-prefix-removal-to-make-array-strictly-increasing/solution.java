class Solution {
    public int minimumPrefixLength(int[] nums) {
        int min=Integer.MAX_VALUE;
        int len=nums.length;
        for(int i=len-1;i>=0;i--){
            int curr=nums[i];
            if(min<=curr){
                return i+1;
            }else{
                min=Math.min(min,curr);
            }
        }
        return 0;
    }
}
