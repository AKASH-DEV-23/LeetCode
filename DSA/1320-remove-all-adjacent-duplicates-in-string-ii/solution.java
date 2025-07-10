class Pair{
    char prevChar;
    int freq;
    public Pair(char prevChar, int freq){
        this.prevChar=prevChar;
        this.freq=freq;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek().prevChar==ch){
                if(st.peek().freq+1==k){
                    while(!st.isEmpty() && st.peek().prevChar==ch)   st.pop();
                }else{
                    st.push(new Pair(ch,st.peek().freq+1));
                }
            }else{
                st.push(new Pair(ch,1));
            }
        }   
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop().prevChar);
        }
        return sb.reverse().toString();
    }
}
