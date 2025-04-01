class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int answer[]=new int[n];
        answer[n-1]=0;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                answer[i]=0;
            }else{
                answer[i]=st.peek()-i;
            }
            st.push(i);
        }
        return answer;
    }
}