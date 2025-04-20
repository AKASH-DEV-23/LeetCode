class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st=new Stack<Integer>();
        for(int currentNum:nums){
            while(!st.isEmpty() && st.peek()>currentNum){
                currentNum=Math.max(st.pop(),currentNum);
            }
            st.push(currentNum);
        }
        return st.size();
    }
}
