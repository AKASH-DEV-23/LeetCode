class Solution {
    public int digitFrequencyScore(int n) {
        int[] digit=new int[10];
        while(n!=0){
            digit[n%10]++;
            n/=10;
        }
        int ans=0;
        for(int i=0;i<10;i++){
            ans+=(i*digit[i]);
        }
        return ans;
    }
}
