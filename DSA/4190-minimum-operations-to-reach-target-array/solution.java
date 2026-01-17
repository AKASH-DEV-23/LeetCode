class Solution {
    public int minOperations(int[] nums, int[] target) {
        Set<Integer> vis=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target[i])  continue;
            if(nums[i]!=target[i])  vis.add(nums[i]);
        }
        return vis.size();
    }
}
