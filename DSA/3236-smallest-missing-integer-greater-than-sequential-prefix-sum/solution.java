class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=nums[0];
        for(int i=1;i<nums.length; i++){
            if(nums[i] !=  nums[i-1]+1){
                break;
            }else{
                sum+=nums[i];
            }
        }
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}
