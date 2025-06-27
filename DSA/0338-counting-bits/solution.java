class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++){
            int cnt=0;
            int num=i;
            while(num!=0){
                if(num%2==1)  cnt++;
                num/=2;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
