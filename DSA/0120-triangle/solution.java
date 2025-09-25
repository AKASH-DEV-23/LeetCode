class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2; i>=0; i--){
            for(int j=0;j<=i;j++){
                int currEle=triangle.get(i).get(j);
                int minValue=Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, currEle+minValue);
            }
        }
        return triangle.get(0).get(0);
    }
}


    //             2
    //         3       4
    //     6       5       7       <--  st from this pick curr ele + min(nextRow,nextRow+1);
    // 4       1       8       3
