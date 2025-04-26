class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map=new HashMap<>();
        for(List<String> list:responses){
            Set<String> set=new HashSet<>();
            for(String s:list){
                set.add(s);
            }
            for(String s:set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        List<Map.Entry<String,Integer>> ans=new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String,Integer>> com=new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b){
                if(a.getValue()<b.getValue()){
                    return 1;
                }else if(a.getValue() > b.getValue()){
                    return -1;
                }else{
                    return a.getKey().compareTo(b.getKey());
                }
            }
        };
        Collections.sort(ans,com);
        // System.out.print(ans);
        return ans.get(0).getKey();
    }
}
