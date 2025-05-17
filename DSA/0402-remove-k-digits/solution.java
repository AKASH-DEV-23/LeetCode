class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        for(char ch:num.toCharArray()){
            int curr=ch-'0';
            while(!st.isEmpty() && st.peek()>curr && k>0){
                st.pop();
                k--;
            }
            st.push(ch-'0');
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
         i=0;
        sb.reverse();
        while(!sb.isEmpty() && sb.charAt(0)=='0')   sb.deleteCharAt(0);
        if(sb.isEmpty())    return "0";
        return sb.toString();
    }
}
