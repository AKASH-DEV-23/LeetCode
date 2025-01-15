class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int rowBegin=0;
        int colBegin=0;
        int rowEnd=mat.length-1;
        int colEnd=mat[0].length-1;

        List<Integer> list=new ArrayList<>();

        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                list.add(mat[rowBegin][i]);
            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                list.add(mat[i][colEnd]);
            }
            colEnd--;

            if(rowBegin<=rowEnd){
            for(int i=colEnd;i>=colBegin;i--){
                list.add(mat[rowEnd][i]);
            }
            rowEnd--;}

            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--){
                list.add(mat[i][colBegin]);
            }
            colBegin++;}
        }
        return list;
    }
}
