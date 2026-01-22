class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums)   list.add(num);

        int cnt=0;

        while(true){
            if(isSorted(list))  break;
            int minSum=Integer.MAX_VALUE;
            int idx=-1;

            for(int i=1;i<list.size();i++){
                int currSum=list.get(i)+list.get(i-1);
                if(currSum<minSum){
                    minSum=currSum;
                    idx=i;
                }
            }

            list.set(idx,minSum);
            list.remove(idx-1);
            cnt++;
        }

        return cnt;
    }

    private boolean isSorted(List<Integer> list){
        List<Integer> temp=new ArrayList<>();
        for(int num:list)   temp.add(num);
        Collections.sort(temp);
        return list.equals(temp);
    }
}
