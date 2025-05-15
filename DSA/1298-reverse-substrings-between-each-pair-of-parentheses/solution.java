class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=')'){
                st.push(ch);
            }else{
                List<Character> list=new ArrayList<>();
                while(st.peek()!='('){
                    list.add(st.pop());
                }
                st.pop();
                for(char c:list){
                    st.push(c);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop()+"");
        }
        return sb.toString();
    }
}
