class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxi=0;
        int size=heights.length;
        int[] left=new int[size];
        int[] right=new int[size];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<size;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())    left[i]=-1;
            else    left[i]=st.peek();
            st.push(i);
        }
        st.clear();
        int len=size;
        for(int i=len-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())    right[i]=size;
            else    right[i]=st.peek();
            st.push(i);
        }
        for(int i=0;i<size;i++){
            int width=right[i]-left[i]-1;
            maxi=Math.max(maxi,heights[i]*width);
        }
        return maxi;
    }
}
