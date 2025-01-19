class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch== '{'){
                st.push(ch);
            }else{
                if(st.isEmpty())    return false;
                char opening = st.pop();
                if(opening=='(' && ch == ')' || opening=='[' && ch==']' || opening=='{' && ch=='}'){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
