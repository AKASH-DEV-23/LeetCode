class Solution {
    public int majorityElement(int[] nums) {
        int maj=0;
        int point=0;
       for(int num: nums){
        if(point==0){
            maj=num;
            point++;
        }else if(num==maj){
            point++;
        }else{
            point--;
        }
       }
       return maj;
    }
}
