class Solution {
    public int reductionOperations(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        if(map.size()==1)   return 0;
        int[] arr=new int[map.size()-1];
        int i=-1;
        for(int val:map.values()){
            if(i==-1){
                i++;
                continue;
            }
           arr[i++]=val;
        }
        int n=arr.length;
        int[] suffix=new int[n];
        suffix[n-1]=0;
        for(int j=n-2;j>=0;j--){
            suffix[j]=suffix[j+1]+arr[j+1];
        }
        for(i=n-1;i>=0;i--){
            ans+=suffix[i]+arr[i];
        }
        return ans;
    }
}
