class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] res={1};
        for(int i=0;i<rowIndex;i++){
            int[] temp=new int[res.length+1];
            for(int j=0;j<res.length;j++){
                temp[j]+=res[j];
                temp[j+1]+=res[j];
            }
            res=temp;
        }

        List<Integer> ans=new ArrayList<>();
        for(int num:res)    ans.add(num);
        return ans;
    }
}
