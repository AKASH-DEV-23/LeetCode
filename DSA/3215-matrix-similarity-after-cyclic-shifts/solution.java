class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int row=mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            int[] singleRow=mat[i];
            int[] prevRow=mat[i].clone();
            performRotation(singleRow,k);
            if(!Arrays.equals(singleRow,prevRow))    return false;
        }
        return true;
    }

    private void performRotation(int[] arr, int k){
        int i=0;
        int len=arr.length;
        k=k%len;
        reverse(arr,0,len-1);
        reverse(arr,0,k-1);
        reverse(arr,k,len-1);
    }

    private void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
