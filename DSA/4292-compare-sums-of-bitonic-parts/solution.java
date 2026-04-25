class Solution {
    public int compareBitonicSums(int[] nums) {
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                idx=i-1;
                break;
            }
        }
        long left=0;
        long right=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(i==idx){
                flag=false;
                continue;
            }
            if(flag){
                left+=nums[i];
            }else{
                right+=nums[i];
            }
        }
        if(left>right)  return 0;
        else if(right>left)  return 1;
        return -1;
    }
}
