class Solution {
    public int removeDuplicates(int[] nums) {
        int len=1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                len++;
            }
        }
        return len;
    }
}
