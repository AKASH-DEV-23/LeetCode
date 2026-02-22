class Solution {
    public int scoreDifference(int[] nums) {
        int firstP=0;
        int secondP=0;
        boolean fir=true;
        boolean sec=false;
        for(int i=0;i<nums.length;i++){
            if((i+1)%6==0){
                fir=!fir;
                sec=!sec;
            }
            if(nums[i]%2!=0){
                fir=!fir;
                sec=!sec;
            }
            if(fir){
                firstP+=nums[i];
            }else{
                secondP+=nums[i];
            }
        }
        return firstP-secondP;
    }
}
