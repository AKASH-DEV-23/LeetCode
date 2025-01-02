class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int zero=0;
        int max=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                zero++;
            }
            if(zero>k){
                while(zero>k){
                    if(nums[i]==0){
                        zero--;
                    }
                    i++;
                }
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
