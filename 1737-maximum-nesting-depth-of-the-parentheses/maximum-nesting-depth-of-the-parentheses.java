class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push(ch);
            cnt=Math.max(cnt,st.size());
            if(ch ==')' && !st.isEmpty() && st.peek()=='(') st.pop();
        }
        return cnt;
    }
}