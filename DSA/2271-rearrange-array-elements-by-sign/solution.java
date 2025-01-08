class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int pos=0;
        int neq=1;
        for(int num:nums){
            if(num<0){
                arr[neq]=num;
                neq+=2;
            }else{
                arr[pos]=num;
                pos+=2;
            }
        }
        return arr;
    }
}
