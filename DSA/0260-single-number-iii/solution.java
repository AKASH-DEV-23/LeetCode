class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }else{
                set.remove(num);
            }
        }
        int idx=0;
        for(int num:set){
            ans[idx++]=num;
        }
        return ans;
    }
}
