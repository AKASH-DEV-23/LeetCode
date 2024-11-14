class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int pos=0;
        int nev=1;
        for(int num:nums){
            if(num>0){
                res[pos]=num;
                pos+=2;
            } else{
                res[nev]=num;
                nev+=2;
            }
        }
        return res;
    }
}
