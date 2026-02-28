class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Arrays.sort(nums);
        int[] freq=new int[101];
        for(int temp:nums){
            freq[temp]++;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(freq[nums[i]]!=freq[nums[j]]){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
