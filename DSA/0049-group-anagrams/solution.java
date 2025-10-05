class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            String key=sorted(s);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(s);
        }
        List<List<String>> ans=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    private String sorted(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
