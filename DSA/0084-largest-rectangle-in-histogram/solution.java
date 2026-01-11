class Solution {
    public int largestRectangleArea(int[] heights) {
        int size=heights.length;
        int[] left=new int[size];
        Stack<Integer> st=new Stack();
        for(int i=0;i<size;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            left[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        int[] right=new int[size];
        for(int i=size-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=st.isEmpty() ? size : st.peek();
            st.push(i);
        }

        int ans=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            int width=right[i]-left[i]-1;
            ans=Math.max(ans,heights[i]*width);

        }
        return ans;

    }
}
