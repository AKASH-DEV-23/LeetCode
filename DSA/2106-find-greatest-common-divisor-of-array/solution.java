class Solution {
    public int findGCD(int[] nums) {
        if(nums==null || nums.length==0)    return 0;
        int a=nums[0];
        int b=nums[0];
        for(int num:nums){
            if(num<a)   a=num;
            if(num>b)   b=num;
        }
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
