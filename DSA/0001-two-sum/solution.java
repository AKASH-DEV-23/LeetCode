class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mymap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mymap.containsKey(diff)) return new int[]{mymap.get(diff),i};
            mymap.put(nums[i],i);
        }
        return new int[]{0};
    }
}
