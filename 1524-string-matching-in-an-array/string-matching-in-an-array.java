class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        int n=words.length;
        Arrays.sort(words);
        // System.out.print(Arrays.toString(words));
        for(int i=0;i<n;i++){
            String s=words[i];
            for(int j=0;j<n;j++){
                if(words[j].contains(s) && !s.equals(words[j])){
                    set.add(s);
                }
            }
        }
        for(String s:set){
            list.add(s);
        }
        return list;
    }
}