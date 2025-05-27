class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int V=0;
        for(int[] find:edges){
            for(int f:find)
                V=Math.max(V,f);
        }
        for(int i=1;i<=V;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }
        int[] inDegree=new int[V+1];
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            for(int v:entry.getValue()){
                inDegree[v]++;
            }
        }
        for(int i=1;i<=V;i++){
            if(inDegree[i]==V-1)    return i;
        }
        return 0;
    }
}
