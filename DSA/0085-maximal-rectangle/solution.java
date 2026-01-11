class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] grid=new int[row][col];
        for(int j=0;j<col;j++){
            grid[0][j]=matrix[0][j]=='1'?1:0;
        }
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    grid[i][j]=grid[i-1][j]+1;
                }else{
                    grid[i][j]=0;
                }
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            ans=Math.max(ans,histogram(grid[i]));
        }
        return ans;
    }

    private int histogram(int[] nums){
        int size=nums.length;
        int[] left=new int[size];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<size;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])    st.pop();
            left[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        int[] right=new int[size];
        for(int i=size-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])    st.pop();
            right[i]=st.isEmpty()?size:st.peek();
            st.push(i);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            int width=right[i]-left[i]-1;
            ans=Math.max(ans,nums[i]*width);

        }
        return ans;
    }
}
