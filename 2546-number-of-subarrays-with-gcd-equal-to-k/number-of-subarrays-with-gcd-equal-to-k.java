class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int size=nums.length;
        int cnt=0;
        for(int i=0;i<size;i++){
            if(nums[i]==k)  cnt++;
            int currGCD=nums[i];
            for(int j=i+1;j<size;j++){
                currGCD=gcd(currGCD,nums[j]);
                if(currGCD==k)  cnt++;
                // if(currGCD>k)   break;
            }
        }
        return cnt;
    }
    private int gcd(int a, int b){
        if(b==0)    return a;
        return gcd(b,a%b);
    }
}