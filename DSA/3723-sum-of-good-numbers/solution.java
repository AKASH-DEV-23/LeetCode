class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            int left=i-k;
            int right=i+k;
            if(left>=0 && right <=n){
                if(nums[i] > nums[left] && nums[i] > nums[right])
                    sum+=nums[i];
            }else if(left<0 && right <=n){
                if(nums[i] > nums[right])
                    sum+=nums[i];
            }else if(right>n && left>=0){
                if(nums[i] > nums[left])
                    sum+=nums[i];
            }
        }
        return sum;
    }
}
