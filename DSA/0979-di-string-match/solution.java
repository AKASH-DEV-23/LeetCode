class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length()+1];
        int maxi=s.length();
        int mini=0;
        int i=0;
        for(char ch:s.toCharArray()){
            if(ch=='D') ans[i++]=maxi--;
            else    ans[i++]=mini++;
        }
        ans[ans.length-1]=(s.length()-1)=='D' ? maxi : mini;
        return ans;
    }
}
