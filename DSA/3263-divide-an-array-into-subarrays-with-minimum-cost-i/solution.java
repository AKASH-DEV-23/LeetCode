class Solution {
    public int minimumCost(int[] nums) {
        int cost=nums[0];
        int firMin=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(firMin>=nums[i]){
                secMin=firMin;
                firMin=nums[i];
            }else if(secMin>=nums[i]){
                secMin=nums[i];
            }
        }
        return cost+firMin+secMin;
    }
}
