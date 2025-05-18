class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=findSum(nums[i]);
            if(i==sum)    return i;
        }
        return -1;
    }
    private int findSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum=sum+rem;
        }
        return sum;
    }
}
