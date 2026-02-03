class Solution {
    public boolean isTrionic(int[] nums) {
    int i=0;
    if(nums[0]>nums[1]) return false;
    while(i<nums.length-1){
        if(nums[i]>nums[i+1]) break;
        else if(nums[i]==nums[i+1]) return false;
        else if(nums[i]<nums[i+1]) i++;
    }
    int j=i;
    while(j<nums.length-1){
        if(nums[j]<nums[j+1]) break;
        else if(nums[j]==nums[j+1]) return false;
        else if(nums[j]>nums[j+1]) j++;
    }
    int k=j;
    while(k<nums.length-1){
        if(nums[k]>nums[k+1]) break;
        else if(nums[k]==nums[k+1]) return false;
        else if(nums[k]<nums[k+1]) k++;
    }
    if(i!=0 && j!=nums.length-1 && i<j && k>=nums.length-1) return true;
    return false;
    }
}
