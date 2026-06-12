class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrSize=nums.length;
        int[] prefix=new int[arrSize];
        int[] suffix=new int[arrSize];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);
        
        for(int i=1;i<arrSize;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        for(int i=arrSize-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<arrSize;i++){
            nums[i]=prefix[i]*suffix[i];
        }

        return nums;
    }
}
