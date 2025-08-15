class Solution {
    public int[][] diagonalSort(int[][] mat) {
        List<List<Integer>> clst=new ArrayList<>();
        int m=mat.length-1;
        int n=mat[0].length-1;
        for(int idx=0;idx<=n;idx++){
            int i=0;
            int j=idx;
            List<Integer> temp=new ArrayList<>();
            while(i<=m && j<=n){
                temp.add(mat[i][j]);
                i++;
                j++;
            }
            clst.add(new ArrayList<>(temp));
        }
        List<List<Integer>> rlst=new ArrayList<>();
        for(int idx=0;idx<=m;idx++){
            int i=idx;
            int j=0;
            List<Integer> temp=new ArrayList<>();
            while(i<=m && j<=n){
                temp.add(mat[i][j]);
                i++;
                j++;
            }
            rlst.add(new ArrayList<>(temp));
        }
        for(int idx=0;idx<=n;idx++){
            List<Integer> temp=clst.get(idx);
                Collections.sort(temp);
                int i=0;
                int j=idx;
                int itr=0;
                while(i<=m && j<=n && itr<temp.size()){
                    mat[i][j]=temp.get(itr);
                    i++;
                    j++;
                    itr++;
                }
        }
             for(int idx=0;idx<=m;idx++){
                List<Integer> temp=rlst.get(idx);
                int i=idx;
                int j=0;
                int itr=0;
                Collections.sort(temp);
                while(i<=m && j<=n && itr<temp.size()){
                     mat[i][j]=temp.get(itr);
                     i++;
                     j++;
                     itr++;
                }
        }
        return mat;
    }
}
