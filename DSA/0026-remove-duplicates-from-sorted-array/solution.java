class Solution {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int n : nums){
            if(count < 1 || n != nums[count-1]){
                nums[count] = n;
                count++;
            }
        }
        return count;
    }

}
