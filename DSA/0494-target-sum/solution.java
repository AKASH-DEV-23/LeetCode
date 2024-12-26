class Solution {
    public int findTargetSumWays(int[] nums, int target) {
     Map<Integer, Integer> dp=new HashMap<>();
    dp.put(0,1);
     for(int num:nums){
        Map<Integer, Integer> newDp=new HashMap<>();

        for(int sum:dp.keySet()){
            int count = dp.get(sum);

            newDp.put(num+sum, newDp.getOrDefault(sum+num,0)+count);
            newDp.put(sum-num, newDp.getOrDefault(sum-num,0)+count);
        }
        dp=newDp;
     }   
     return dp.getOrDefault(target,0);
    }
}
