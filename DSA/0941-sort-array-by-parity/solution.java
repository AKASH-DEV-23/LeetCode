class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] even=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even[k]=nums[i];
                k++;
                nums[i]=-1;
            }
        }
        for(int num:nums){
            if(num>-1){
                even[k]=num;
                k++;
            }
        }
        return even;

    }
}
