class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(String str : words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
            .thenComparing(Map.Entry.comparingByKey()));
        int i=0;
        while(k>0){
            Map.Entry<String, Integer> sorted = list.get(i++);
            ans.add(sorted.getKey());
            k--;
        }
        return ans; 
    }
}
