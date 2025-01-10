class Solution {
    public int majorityElement(int[] nums) {
        int pnt=0;
        int cnd=nums[0];

        for(int num:nums){
            if(pnt==0) { 
                cnd=num;
                pnt++;
            }
            else if(cnd==num)   pnt++;
            else    pnt--;
        }

        return cnd;
    }
}
