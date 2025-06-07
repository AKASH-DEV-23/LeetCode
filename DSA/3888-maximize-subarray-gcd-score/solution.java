class Solution {
    public long maxGCDScore(int[] nums, int k) {
        int[] zeros=cntZero(nums);
        return maxScore(nums,zeros,k);
    }
    private int[] cntZero(int[] nums){
        int[] zero=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            zero[i]=Integer.numberOfTrailingZeros(nums[i]);
        }
        return zero;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    private long maxScore(int[] nums,int[] zero, int k){
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++){
            int g=0;
            int cnt=0;
            int mini=31;
            for(int j=i;j<n;j++){
                g=gcd(g,nums[j]);
                int z=zero[j];
                if(z<mini){
                    mini=z;
                    cnt=1;
                }else if(z==mini){
                    cnt++;
                }
                long sco=(long)(j-i+1)*g;
                ans=Math.max(ans,sco);
                if(cnt<=k){
                    ans=Math.max(ans,sco*2);
                }
            }
        }
        return ans;
    }
}
