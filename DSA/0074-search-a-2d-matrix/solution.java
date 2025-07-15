class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st=0;
        int end=matrix.length-1;
        int mid=0;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target<matrix[mid][0])   end=mid-1;
            else if(target>matrix[mid][matrix[0].length-1]) st=mid+1;
            else{
                break;
            }
        }
        st=0;
        end=matrix[0].length-1;
        while(st<=end){
            int m=st+(end-st)/2;
            if(target==matrix[mid][m])  return true;
            if(target<matrix[mid][m])   end=m-1;
            else if(target>matrix[mid][m])    st=m+1;
        }
        return false;
    }
}
