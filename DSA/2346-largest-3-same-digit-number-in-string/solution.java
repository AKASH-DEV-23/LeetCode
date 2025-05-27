class Solution {
    public String largestGoodInteger(String num) {
        int[] count=new int[10];
        int n=num.length();
        for(int i=2;i<n;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){
                count[num.charAt(i)-'0']++;
            }
        }
        String ans="";
        for(int i=9;i>=0;i--){
            if(count[i]>0){
                ans=i+"";
                break;
            }
        }
        ans=ans+ans+ans;
        return ans;
    }
}
