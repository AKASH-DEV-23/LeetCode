class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int[] ans=new int[size];
        size-=1;
        Stack<Integer> st=new Stack<>();
        while(size>=0){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[size]) st.pop();
            if(st.isEmpty())    ans[size]=0;
            else    ans[size]=st.peek()-size;
            st.push(size--);
        }
        return ans;
    }
}
