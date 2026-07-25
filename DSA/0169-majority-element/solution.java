class Solution {
    public int majorityElement(int[] nums) {
        int candi=-1;
        int vote=0;
        for(int num:nums){
            if(vote==0){
                candi=num;
                vote++;
            }
            else if(num==candi){
                vote++;
            }else{
                vote--;
            }
        }

        return candi;
    }
}
