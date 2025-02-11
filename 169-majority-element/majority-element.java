class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0];
        int point=0;
        for(int num:nums){
            if(point==0){
                cand=num;
                point++;
            }else if(cand==num){
                point++;
            }else{
                point--;
            }
        }
        return cand;
    }
}