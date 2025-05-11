class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String,Integer>> com=new Comparator<>(){
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b){
                if(a.getValue()>b.getValue())   return -1;
                else if(a.getValue()<b.getValue())  return 1;
                else{
                    return a.getKey().compareTo(b.getKey());
                }
            }
        };
        Collections.sort(list,com);
        List<String> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(list.get(i).getKey());
        }
        return ans;
    }
}
