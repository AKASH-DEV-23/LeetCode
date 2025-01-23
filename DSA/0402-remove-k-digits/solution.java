class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Integer> st=new Stack<>();

        for(char ch : s.toCharArray()){
            int num = ch-'0';
            while(!st.isEmpty() && k>0 && st.peek()>num){
                st.pop();
                k--;
            }
            st.push(num);
        }
        String ans="";
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty())    return "0";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        String res="";
        boolean flag=true;
        for(int i=ans.length()-1;i>=0;i--){
            if(ans.charAt(i) =='0' && flag ){
                continue;
            }else{
                flag=false;
                res+=ans.charAt(i);
            }
        }
        return res=="" ? "0" : res;
    }
}
