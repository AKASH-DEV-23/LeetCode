class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] mat:image){
            flip(mat);
            invert(mat);
        }
        return image;
    }
    private void flip(int[] mat){
        int i=0;
        int j=mat.length-1;
        while(i<j){
            int temp=mat[i];
            mat[i]=mat[j];
            mat[j]=temp;
            i++;
            j--;
        }
    }
    private void invert(int[] mat){
        for(int i=0;i<mat.length;i++){
            mat[i]=mat[i]==0 ? 1 :0;
        }
    }
}
