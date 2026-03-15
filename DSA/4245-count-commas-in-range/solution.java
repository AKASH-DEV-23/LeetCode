class Solution {
    public int countCommas(int n) {
        if(n<1000)  return 0;
        int ans=0;
        for(int i=1000;i<=n;i++){
            ans+=check(i);
        }
        return ans;
    }

    private int check(int num){
        StringBuilder sb=new StringBuilder(num+"");
        int len=sb.length();
        int div=len/3;
        if(len%3!=0){
            return div;
        }
        return div-1;
    }
}
