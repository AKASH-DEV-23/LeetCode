class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==1){
                    maxi=Math.max(j-i+1,maxi);
                }
            }
        }
        return maxi;
    }
}
