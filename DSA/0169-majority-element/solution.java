class Solution {
    public int majorityElement(int[] nums) {
        int maxPoint=0;
        int newCandi=Integer.MIN_VALUE;
        for(int num: nums){
            if(maxPoint==0){
                newCandi=num;
                maxPoint++;
            }
            else if(newCandi==num){
                maxPoint++;
            } else{
                maxPoint--;
            }
        }
        return newCandi;
    }
}
