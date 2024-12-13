class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int smax=-1;
        for(int num:nums){
            if(max<num){
                smax=max;
                max=num;
            }
            else if(smax<num){
                smax=num;
            }
        }

        return (max-1)*(smax-1);
    }
}
