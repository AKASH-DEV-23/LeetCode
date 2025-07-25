class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set1=new HashSet<>();
        int sum=0;
        for(int num:nums)   set1.add(num);
        for(int num:set1){
            if(num>0)   sum+=num;
        }
        Arrays.sort(nums);
        if(sum==0){
            return nums[nums.length-1];
        }
        return sum;
    }
}
