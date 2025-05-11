class Solution {
    public int minDeletion(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Character,Integer>> com=new Comparator<>(){
            public int compare(Map.Entry<Character,Integer> a, Map.Entry<Character,Integer> b){
                if(a.getValue()<b.getValue())    return -1;
                else if(a.getValue()>b.getValue())    return 1;
                else    return 0;
            }
        };
        Collections.sort(list,com);
        int n=list.size()-k;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=list.get(i).getValue();
        }
        return cnt;
    }
}
