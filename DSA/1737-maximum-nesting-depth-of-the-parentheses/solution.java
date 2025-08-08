class Solution {
    public int maxDepth(String s) {
        int open=0;
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') open++;
            else if(ch==')')    open--;
            cnt=Math.max(open,cnt);
        }
        return cnt;
    }
}
