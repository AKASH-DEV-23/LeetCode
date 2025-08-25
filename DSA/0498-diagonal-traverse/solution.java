class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] ans=new int[m*n]; 
        Map<Integer,List<Integer>> mp=new TreeMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key=i+j;
                if(!mp.containsKey(key))    mp.put(key, new ArrayList<>());
                mp.get(key).add(mat[i][j]);
            }
        } 
        boolean flag=true;
        int idx=0;
        for(int key:mp.keySet()){
            List<Integer> temp=mp.get(key);
            if(flag)    Collections.reverse(temp);
            for(int num:temp){
                ans[idx++]=num;
            }
            flag=!flag;
        } 
        return ans;
    }
}
