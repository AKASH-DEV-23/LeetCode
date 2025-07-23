class Solution {
    public int titleToNumber(String s) {
        int size=s.length();
        int ans=0;
        int p=0;
        for(int i=size-1;i>=0;i--){
            int sum= (int)(s.charAt(i)-'A');
            sum+=1;
            sum=sum* (int)Math.pow(26,p);
            p++;
            ans+=sum;
        }
        return ans;
    }
}