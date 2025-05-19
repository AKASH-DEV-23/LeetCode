class Solution {
    public int majorityElement(int[] nums) {
        int point=0;
        int candi=0;
        for(int num:nums){
            if(point==0){
                candi=num;
                point=1;
            }else if(candi==num){
                point++;
            }else{
                point--;
            }
        }
        return candi;
    }
}
