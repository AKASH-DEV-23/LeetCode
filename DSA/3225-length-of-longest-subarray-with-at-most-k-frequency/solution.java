class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        Map<Integer,Integer> freq=new HashMap<>();
        int maxLen=0;
        
        for(int low=0,high=0;high<nums.length;high++){
            freq.put(nums[high],freq.getOrDefault(nums[high],0)+1);

            while(freq.get(nums[high])>k){
                freq.put(nums[low],freq.get(nums[low])-1);
                low++;
            }

            maxLen=Math.max(maxLen,high-low+1);
        }

        return maxLen;

    }
}
