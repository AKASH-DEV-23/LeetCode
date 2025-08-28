class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'a';
            val=26-val;
            ans+=val*(i+1);
        }
        return ans;
    }
}
