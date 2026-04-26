class Solution {
    public String sortVowels(String s) {
        Map<Character,Integer> mp=new LinkedHashMap<>();
        Set<Character> vis=new HashSet<>();
        Collections.addAll(vis,'a','e','i','o','u');
        for(char ch:s.toCharArray()){
            if(vis.contains(ch))
                mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> lst=new ArrayList<>(mp.entrySet());
        Collections.sort(lst,new Comparator<>(){
            public int compare(Map.Entry<Character,Integer> ent1, Map.Entry<Character,Integer> ent2){
                if(ent1.getValue()<ent2.getValue())  return 1;
                else if(ent1.getValue()>ent2.getValue())  return -1;
                else  return 0;
            }
        });
        StringBuilder vowels=new StringBuilder();
        for(Map.Entry<Character,Integer> ent:lst){
            int vl=ent.getValue();
            while(vl>0){
                vowels.append(ent.getKey());
                vl--;
            }
        }
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(vis.contains(s.charAt(i))){
                sb.append(vowels.charAt(idx++));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
