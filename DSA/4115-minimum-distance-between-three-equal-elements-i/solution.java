class Solution {
    public int minimumDistance(int[] nums) {
        int minDistance=Integer.MAX_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        minDistance=Math.min(minDistance,(j-i)+(k-j)+(k-i));
                    }
                }
            }
        }
        return minDistance==Integer.MAX_VALUE ? -1: minDistance;
    }
}
