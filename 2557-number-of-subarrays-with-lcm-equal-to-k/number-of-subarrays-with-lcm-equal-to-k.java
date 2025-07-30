class Solution {
    public int subarrayLCM(int[] nums, int k) {
       int cnt=0;
       int size=nums.length;
       for(int i=0;i<size;i++){
            if(nums[i]==k)  cnt++;
            int currLCM=nums[i];
            for(int j=i+1;j<size;j++){
                currLCM=lcm(currLCM,nums[j]);
                if(currLCM==k)  cnt++;
                if(currLCM>k)   break;
            }
        }
        return cnt;
    }
    private int gcd(int a, int b){
        if(b==0)    return a;
        return gcd(b,a%b);
    }
    private int lcm(int a, int b){
        return a*(b/gcd(a,b));
    }
}