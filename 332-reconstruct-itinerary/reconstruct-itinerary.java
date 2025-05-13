class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,List<String>> map=new HashMap<>();
        for(List<String> list:tickets){
            String u=list.get(0);
            String v=list.get(1);
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<>());
            }
            map.get(u).add(v);
        }
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            Collections.sort(entry.getValue());
        }
        List<String> ans=new ArrayList<>();
        dfs("JFK",map,ans);
        Collections.reverse(ans);
        return ans;
    }
    private void dfs(String airport,Map<String,List<String>> map, List<String> ans){
        List<String> desti=map.get(airport);
        while(desti!=null && !desti.isEmpty()){
            String next=desti.remove(0);
            dfs(next,map,ans);
        }
        ans.add(airport);
    }
}