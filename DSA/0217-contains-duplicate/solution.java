class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> vis=new HashSet<>();
        for(int num:nums){
            if(!vis.add(num))    return true;
        }
        return false;
    }
}
