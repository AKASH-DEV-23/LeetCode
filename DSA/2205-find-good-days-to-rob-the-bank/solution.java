class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans=new ArrayList<>();
        int size=security.length;
        int[] left=new int[size];
        int[] right=new int[size];
        for(int i=1;i<size;i++){
            if(security[i]<=security[i-1])  left[i]=left[i-1]+1;
        }
        for(int i=size-2;i>=0;i--){
            if(security[i]<=security[i+1])  right[i]=right[i+1]+1;
        }
        for(int i=0;i<size;i++){
            if(left[i]>=time && right[i]>=time) ans.add(i);
        }
        return ans;
    }
}
