class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st=new Stack<>();

        for(long curr:nums){
            while(!st.isEmpty() && st.peek()==curr){
                curr=st.pop()+curr;
            }
            st.push(curr);
        }

        List<Long> ans=new ArrayList<>();

        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        Collections.reverse(ans);

        return ans;
    }
}
