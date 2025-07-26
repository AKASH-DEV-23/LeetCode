class Solution {
    public int arraySign(int[] nums) {
        int negative=0;
        int zero=0;
        for(int num:nums){
            if(num<0)  negative++;
            if(num==0)  zero++;
        }
        if(zero>0)  return 0;
        else if(negative%2!=0)  return -1;
        return 1;
    }
}