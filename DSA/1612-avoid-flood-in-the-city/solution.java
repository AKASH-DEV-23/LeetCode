class Solution {
    public int[] avoidFlood(int[] rains) {
        Map<Integer,Integer>  mp=new HashMap<>();
        TreeSet<Integer> vis=new TreeSet<>();
        int n=rains.length;
        int[] ans=new int[n];
        Arrays.fill(ans,1);
        for(int i=0;i<n;i++){
            if(rains[i]==0) vis.add(i);
            else{
                if(mp.containsKey(rains[i])){
                    int fillIdx=mp.get(rains[i]);
                    Integer lastday=vis.higher(fillIdx);
                    if(lastday!=null){
                        ans[lastday]=rains[i];
                        vis.remove(lastday);
                    }else{
                        return new int[0];
                    }
                }
                mp.put(rains[i],i);
                ans[i]=-1;  
            }
        }
        return ans;
    }
}
