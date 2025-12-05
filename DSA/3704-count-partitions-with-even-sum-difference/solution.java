class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int totalSum=prefix[n-1];
        int cnt=0;
        for(int i=0;i<n-1;i++){
            int currSum=totalSum-prefix[i];
            int diff=Math.abs(currSum-prefix[i]);
            if(diff%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}
