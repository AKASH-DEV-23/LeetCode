class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int j=0;
        int maxSum=0;
        int sum=0;
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                int key=map1.get(nums[i]);
                while(j<=key){
                    sum-=nums[j];
                    j++;
                }
            }
            map1.put(nums[i],i);
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
