class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int num1=st.pop();
                int num2=st.pop();
                switch(s){
                    case "+":
                        st.push(num2+num1);
                        break;
                    case "-":
                        st.push(num2-num1);
                        break;
                    case "*":
                        st.push(num2*num1);
                        break;
                    case "/":
                        st.push(num2/num1);
                        break;
                }
            }
            else {
                int num=Integer.parseInt(s);
                st.push(num);
            }
        }
        return st.pop();
    }
}