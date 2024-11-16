class Solution {
    public boolean search(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.contains(target)){
            return true;
        }
        return false;
    }
}
