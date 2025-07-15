class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> t1=new ArrayList<>();
        t1.add(1);
        ans.add(t1);
        if(numRows==1)  return ans;
        List<Integer> t2=new ArrayList<>();
        t2.add(1);
        t2.add(1);
        ans.add(t2);
        if(numRows==2)  return ans;
        for(int i=2;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
