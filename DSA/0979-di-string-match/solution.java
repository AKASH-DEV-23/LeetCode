class Solution {
    public int[] diStringMatch(String s) {
        int low=0;
        int high=s.length();
        int[] ans=new int[high+1];
        int idx=0;
        for(char ch:s.toCharArray()){
            if(ch=='I')    ans[idx++]=low++;
            else    ans[idx++]=high--;
        }
        ans[idx]=s.charAt(s.length()-1)=='I' ? low : high;
        return ans;
    }
}
