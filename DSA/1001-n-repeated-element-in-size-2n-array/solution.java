class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> vis =new HashSet<>();
        for(int num:nums){
            if(!vis.add(num)){
                return num;
            }
        }
        return -1;
    }
}
