class Solution {
    public String resultingString(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && (Math.abs((st.peek()-'a')-(ch-'a'))==1)){
                st.pop();
                continue;
            }
            if(ch=='z'){
                if(!st.isEmpty() &&  st.peek()=='a'){
                    st.pop();
                    continue;
                }
            }
            if(ch=='a'){
                if(!st.isEmpty() && st.peek()=='z'){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
