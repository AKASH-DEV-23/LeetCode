class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        boolean flag1=check(nums,1,k);
        boolean flag2=check(nums,-1,k);
        return flag1 || flag2;
    }
    private boolean check(int[] nums, int val, int k){
        long ops=0;
        int fir=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                if(fir==-1)  fir=i;
                else{
                    ops+=i-fir;
                    fir=-1;
                }
            }
        }
        return fir==-1 && ops<=k;
    }
}
