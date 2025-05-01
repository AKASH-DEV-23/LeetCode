class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<>();
        paragraph=paragraph.replaceAll("[!?',;.]"," ");
        paragraph = paragraph.toLowerCase();
        Map<String,Integer> map=new HashMap<>();
        for(String s:paragraph.split("\\s+")){
            if(!s.isEmpty())
                map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:banned){
            s=s.toLowerCase();
            if(map.containsKey(s)){
                    map.remove(s);
            }
        }
        // System.out.print(map);
        Comparator<Map.Entry<String,Integer>> com=new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b){
                if(a.getValue()<b.getValue())   return 1;
                else if(a.getValue()>b.getValue())  return -1;
                else    return 0;
            }
        };
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,com);
        return list.get(0).getKey();
    }
}