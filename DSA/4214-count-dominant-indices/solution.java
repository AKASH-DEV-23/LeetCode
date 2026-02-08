class Solution {
    public int dominantIndices(int[] nums) {
        int len=nums.length;
        int[] suffix=new int[len];

        suffix[len-1]=nums[len-1];

        for(int i=len-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }

        int dominant=0;
        for(int i=0;i<len-1;i++){
            if(nums[i]>(suffix[i+1]/(len-1-i))){
                dominant++;
            }
        }

        return dominant;
    }
}
