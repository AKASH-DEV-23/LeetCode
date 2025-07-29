class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int num1=nums[0];
        int num2=nums[nums.length-1];
        for(int i=Math.max(num1,num2);i>=1;i--){
            if(num2%i==0 && num1%i==0)  return i;
        }
        return 0;
    }
}
