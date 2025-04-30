class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        char op='+';
        int i=0;
        int n=s.length()-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+ch-'0';
            }
            if(isOperator(ch) && ch !=' ' || i==n){
                switch(op){
                    case '+':
                        st.push(num);
                        break;
                    case '-':
                        st.push(-num);
                        break;
                    case '*':
                        st.push(st.pop()*num);
                        break;
                    case '/':
                        st.push(st.pop()/num);
                }
                op=ch;
                num=0;
            }   
            i++;
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
    private boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
    }
}
