class Solution {
    public int majorityElement(int[] nums) {
        int point=0;
        int mem=0;
        for(int num:nums){
            if(point==0){
                mem=num;
                point++;
            }else if(mem==num){
                point++;
            }else{
                point--;
            }
        }
        return mem;
    }
}
